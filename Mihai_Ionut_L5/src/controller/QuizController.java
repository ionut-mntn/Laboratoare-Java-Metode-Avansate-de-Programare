package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import model.Question;
import model.Quiz;
import repository.FileRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class QuizController {


    private FileRepo repo;
    private Quiz quiz;
    private List<Question> questions;



    /**
     * Constructor pentru controler
     */
    public QuizController() {
        this.repo = new FileRepo();
        questions = getQuestions();
        generateQuiz();
    }




    /**
     * @return se returneaza toate intrebarile din container
     */
    public List<Question> getQuestions() {
        return repo.getQuestions();
    }




    /**
     * Functie ce genereaza un quiz nou
     */
    public void generateQuiz() {
        Random r = new Random();                                // de schimbat aici !!!!!!!!!
        List<Question> questions1 = new ArrayList<>();
        for (int i = 0; i < 40; i++)
            questions1.add(questions.get(i));
        List<Question> quizQuestions = new ArrayList<>();
        int counter = 1;
        while (counter <= 26) {
            int questionNumber = r.nextInt(questions1.size() - 1);
            Question question = questions1.get(questionNumber);
            question.setId(counter);
            quizQuestions.add(question);
            questions1.remove(question);
            counter++;
        }
        this.quiz = new Quiz(1, quizQuestions, 0, 0);
    }




    /**
     * Getter
     *
     * @return urmatoarea intrebare din quiz
     */
    public Question getNextQuestion() {
        return quiz.getNextQuestion();
    }



    /**
     * Setter
     *
     * actualizeaza numarul raspunsurilor corecte
     */
    public void setCorrectQuestion() {
        quiz.setCorrectAnswers(quiz.getCorrectAnswers() + 1);
    }



    /**
     * Setter
     *
     * actualizeaza numarul de raspunsuri false
     */
    public void setFalseQuestion() {
        quiz.setFalseAnswers(quiz.getFalseAnswers() + 1);
    }



    /**
     * Getter
     *
     * @return number of right Answers
     */
    public int getRightAnswers() {
        return quiz.getCorrectAnswers();
    }



    /**
     * Getter
     *
     * @return number of false Answers
     */
    public int getWrongAnswers() {
        return quiz.getFalseAnswers();
    }



    /**
     * Functie ce returneaza butonul corect pentru o intrebare anume
     *
     * @param question -> question of the quiz
     * @param b1  -> buton care contine primul raspuns corect
     * @param b2  -> buton care contine al doilea raspuns corect
     * @param b3  -> buton care contine al treilea raspuns corect
     * @return butonul corect, in conformitate cu intrebarea
     */
    public Button setCorrectButt(Question question, Button b1, Button b2, Button b3) {
        if (question.getCorrectAnswer().equals(question.getAnswers().get(0)))
            return b1;
        if (question.getCorrectAnswer().equals(question.getAnswers().get(1)))
            return b2;
        return b3;
    }



    /**
     * Functie care verifica si seteaza daca raspunsul corect a fost ales
     *
     * @param actionEvent   -> un obiect de tip handler care descrie obiectul pe care s-a dat click
     * @param correctButton -> the correct answer
     * @return true if the actionEvent corresponds to the correct Button
     */
    public boolean checkCorrectAnswer(ActionEvent actionEvent, Button correctButton) {
        return actionEvent.getSource() == correctButton;
    }




    /**
     * Getter
     *
     * @return quiz-ul
     */
    public Quiz getQuiz() {
        return quiz;
    }


}
