package model;

import java.util.List;

public class Quiz {

    private int id;
    private List<Question> questions;
    private int correctAnswers;
    private int falseAnswers;
    private int crtIndex;



    /**
     * @param id             -> identificator unic al quiz-ului
     * @param questions      -> lista cu intrebarile cuprinse in quiz
     * @param correctAnswers -> numarul raspunsurilor corecte
     * @param falseAnswers   -> numarul raspunsurilor false
     */
    public Quiz(int id, List<Question> questions, int correctAnswers, int falseAnswers) {
        this.id = id;
        this.questions = questions;
        this.correctAnswers = correctAnswers;
        this.falseAnswers = falseAnswers;
        this.crtIndex = 0;
    }



    /**
     * Getter
     *
     * @return numarul unic al quiz-ului
     */
    public int getId() {
        return id;
    }



    /**
     * Setter
     *
     * @param id -> numarul unic al quiz-ului
     */
    public void setId(int id) {
        this.id = id;
    }



    /**
     * activeaza urmatoarea intrebare din quiz
     *
     * @return urmatoarea intrebare din quiz
     */
    public Question getNextQuestion() {
        if (crtIndex >= questions.size())
            return null;
        Question question = this.questions.get(this.crtIndex);
        crtIndex++;
        return question;

    }



    /**
     * Getter
     *
     * @return lista cu intrebarile quiz-ului
     */
    public List<Question> getQuestions() {
        return questions;
    }



    /**
     * Setter
     *
     * @param questions ->  lista cu intrebarile quiz-ului
     */
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }



    /**
     * Getter
     *
     * @return number of the correct answers
     */
    public int getCorrectAnswers() {
        return correctAnswers;
    }



    /**
     * Setter
     *
     * @param correctAnswers -> nr raspunsuri corecte
     */
    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }



    /**
     * Getter
     *
     * @return nr raspunsuri false
     */
    public int getFalseAnswers() {
        return falseAnswers;
    }



    /**
     * Setter
     *
     * @param falseAnswers -> nr raspunsuri false
     */
    public void setFalseAnswers(int falseAnswers) {
        this.falseAnswers = falseAnswers;
    }
}
