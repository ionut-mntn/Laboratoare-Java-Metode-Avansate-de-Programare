package test;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import model.Question;
import model.Quiz;
import controller.QuizController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuizControllerTest  {

    private QuizController quizController;
    private Quiz quiz;



    @Test
    public void testGenerateQuiz() {

        quizController = new QuizController();
        quiz = quizController.getQuiz();

        assertEquals(quiz.getCorrectAnswers(), 0);
        assertEquals(quiz.getFalseAnswers(), 0);
        assertEquals(quiz.getQuestions().size(), 26);

        for (int i = 0; i < 25; i++)
            quizController.getNextQuestion();
        quizController.generateQuiz();

        Quiz quiz1 = quizController.getQuiz();
        assertNotEquals(quiz, quiz1);
        assertEquals(quiz.getQuestions().size(), 26);
        assertEquals(quiz1.getQuestions().size(), 26);
    }



    @Test
    public void testnextQuestion() {

        quizController = new QuizController();
        quiz = quizController.getQuiz();

        Question question = quiz.getNextQuestion();
        Question question1 = quiz.getNextQuestion();
        assertNotEquals(question, question1);
    }



    @Test
    public void testCheckCorrectAnswers() {

        quizController = new QuizController();
        quiz = quizController.getQuiz();

        quiz.setCorrectAnswers(13);
        assertEquals(quizController.getRightAnswers(), 13);
        quiz.setCorrectAnswers(22);
        assertEquals(quizController.getRightAnswers(), 22);
        quiz.setCorrectAnswers(0);
        assertEquals(quizController.getRightAnswers(), 0);
    }



    @Test
    public void testCheckWrongAnswers() {

        quizController = new QuizController();
        quiz = quizController.getQuiz();

        quiz.setFalseAnswers(13);
        assertEquals(quizController.getWrongAnswers(), 13);
        quiz.setFalseAnswers(22);
        assertEquals(quizController.getWrongAnswers(), 22);
        quiz.setFalseAnswers(0);
        assertEquals(quizController.getWrongAnswers(), 0);
    }


    @Test
    public void testSetCorrectButton() {

        quizController = new QuizController();
        quiz = quizController.getQuiz();

        QuizController quizController = new QuizController();

        Platform.startup(() -> {
        });
        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button correctButton = new Button();
        Question question;

        for (int i = 0; i < 26; i++) {
            question = quizController.getNextQuestion();
            if (question.getCorrectAnswer().equals(question.getAnswers().get(0)))
                correctButton = button1;
            if (question.getCorrectAnswer().equals(question.getAnswers().get(1)))
                correctButton = button2;
            if (question.getCorrectAnswer().equals(question.getAnswers().get(2)))
                correctButton = button3;
            assertEquals(correctButton, quizController.setCorrectButt(question, button1, button2, button3));
        }
        quizController.generateQuiz();
        for (int i = 0; i < 26; i++) {
            question = quizController.getNextQuestion();
            if (question.getCorrectAnswer().equals(question.getAnswers().get(0)))
                correctButton = button1;
            if (question.getCorrectAnswer().equals(question.getAnswers().get(1)))
                correctButton = button2;
            if (question.getCorrectAnswer().equals(question.getAnswers().get(2)))
                correctButton = button3;
            assertEquals(correctButton, quizController.setCorrectButt(question, button1, button2, button3));
        }
    }



    @Test
    public void testSetFalseQuestions() {

        quizController = new QuizController();
        quiz = quizController.getQuiz();

        for (int i = 0; i < 10; i++)
            quizController.setFalseQuestion();
        assertEquals(quizController.getWrongAnswers(), 10);
    }



    @Test
    public void testSetCorrectQuestions() {

        quizController = new QuizController();
        quiz = quizController.getQuiz();

        for (int i = 0; i < 20; i++)
            quizController.setCorrectQuestion();
        assertEquals(quizController.getRightAnswers(), 20);
    }



    @Test
    public void testCheckCorrectAnswer(){

        quizController = new QuizController();
        quiz = quizController.getQuiz();

        Button correctButton = new Button();
        correctButton.setOnAction(this::handle);
        EventHandler<ActionEvent> x = correctButton.getOnAction();
        ActionEvent actionEvent = new ActionEvent();
        x.handle(actionEvent);
        //EventType<? extends ActionEvent> action= actionEvent.getEventType();
        assertFalse(quizController.checkCorrectAnswer(actionEvent, correctButton));
    }



    public void handle(ActionEvent actionEvent) {           // doar de proba pentru ultimul test (asta de deasupra)

    }


}
