package model;

import java.util.List;

public class Question {

    private int id;
    private String question;
    private List<String> answers;
    private String correctAnswer;

    /**
     * Constructor
     *
     * @param id            -> id-ul intrebarii
     * @param question      -> intrebarea efectiva
     * @param answers       -> variantele de raspuns
     * @param correctAnswer -> raspunsul corect
     */
    public Question(int id, String question, List<String> answers, String correctAnswer) {
        this.id = id;
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }



    /**
     * Getter
     *
     * @return un string reprezentand textul intrebarii
     */
    public String getQuestion() {
        return question;
    }



    /**
     * Setter
     *
     * @param question -> un string reprezentand textul intrebarii
     */
    public void setQuestion(String question) {
        this.question = question;
    }



    /**
     * Getter
     *
     * @return -> lista de string-uri reprezentand variante de raspuns posibile
     */
    public List<String> getAnswers() {
        return answers;
    }



    /**
     * Setter
     *
     * @param answers -> lista de string-uri reprezentand variante de raspuns posibile
     */
    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }



    /**
     * Getter
     *
     * @return raspunsul corect
     */
    public String getCorrectAnswer() {
        return correctAnswer;
    }



    /**
     * Setter
     *
     * @param correctAnswer -> raspunsul corect
     */
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }



    /**
     * Getter
     *
     * @return id-ul intrebarii
     */
    public int getId() {
        return id;
    }



    /**
     * Setter
     *
     * @param id -> seteaza id-ul intrebarii
     */
    public void setId(int id) {
        this.id = id;
    }



    /**
     * toString function
     *
     * @return un string de trimis catre iesire, reprezentand intrebarea, cu toate atributele sale
     */
    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                "\n, answers=" + answers +
                "\n, correctAnswer='" + correctAnswer + '\'' +
                '}';
    }


}
