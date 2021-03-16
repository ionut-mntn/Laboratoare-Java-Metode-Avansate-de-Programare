package repository;

import model.Question;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRepo {

    private List<Question> questions;

    /**
     * Constructor
     */
    public FileRepo() {                                     // citesc intrebarile din fisier si le stochez in 'questions'

        this.questions = new ArrayList<>();
        File file = new File("question_database.txt");

        try {

            Scanner sc = new Scanner(file);
            int crtId = 1;
            while (sc.hasNextLine()) {

                String question = sc.nextLine();
                String answer1 = sc.nextLine();
                String answer2 = sc.nextLine();
                String answer3 = sc.nextLine();

                ArrayList<String> answers = new ArrayList<>();
                answers.add(answer1);
                answers.add(answer2);
                answers.add(answer3);

                String correctAnswer = sc.nextLine();

                Question toBeAddedQuestion = new Question(crtId, question, answers, correctAnswer);
                this.questions.add(toBeAddedQuestion);
                crtId++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



    /**
     * Getter
     *
     * @return toate intrebarile din repo-ul curent
     */
    public List<Question> getQuestions() {
        return questions;
    }



    /**
     * Setter
     *
     * @param questions -> lista de intrebari
     */
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }



    /**
     * sterge o intrebare anume din container
     *
     * @param q2 -> intrebarea de sters
     */
    public void delete(Question q2) {

        for (Question q: questions) {
            if (q.getId() == q2.getId()) {

                questions.remove(q);
                return;
            }
        }
    }


}
