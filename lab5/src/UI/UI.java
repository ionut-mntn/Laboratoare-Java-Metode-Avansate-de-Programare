package UI;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.Question;
import controller.QuizController;


public class UI extends Application implements EventHandler<ActionEvent> {

    private QuizController quizContr;

    private Button butt;
    private Button corrButt;
    private Button frage;
    private Button score;
    private Button next;
    private Button butt1;
    private Button butt2;
    private Button butt3;


    private Question question;


    private Label timerText;
    private Integer secs;
    private boolean correct;


    /**
     * Constructor
     */
    public UI() {

    }

    /**
     * functia suprascrisa - apelata implicit - prin care se incepe aplicatia
     *
     * @param primaryStage -> scena principala
     * @throws Exception -> orice exceptie
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        quizContr = new QuizController();
        secs = 1800;

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Fragebogen");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();

        BorderPane schema = new BorderPane();
        Scene scene = new Scene(schema, 900, 700);

        this.startPane(primaryStage, scene);

        question = quizContr.getNextQuestion();
        timerText = new Label();

        this.displayButts();

        this.buttsFormats();

        corrButt = quizContr.setCorrectButt(question, butt1, butt2, butt3);

        butt1.setOnAction(this);
        butt2.setOnAction(this);
        butt3.setOnAction(this);

        next.setOnAction(e -> {
            if (correct) {
                quizContr.setCorrectQuestion();
            } else {
                quizContr.setFalseQuestion();
            }
            question = quizContr.getNextQuestion();
            checkQuizStatus(primaryStage);

        });

        GridPane gridPane = new GridPane();
        setPadding(primaryStage, schema, gridPane);

    }


    /**
     * menu care lanseaza in executie aplicatia
     *
     * @param args -> argumentele proiectului (in cazul nostru, nu avem)
     */
    public void menu(String[] args) {
        launch(args);
    }

    /**
     * functie care hotaraste ce se intampla pentru butonul ales
     *
     * @param actionEvent -> un buton pe care s-a facut click
     */
    @Override
    public void handle(ActionEvent actionEvent) {
        correct = quizContr.checkCorrectAnswer(actionEvent, corrButt);
    }

    /**
     * functie care indica timpul ramas pentru rezolvarea quiz-ului
     *
     * @param primaryStage -> stage-ul principal
     */
    private void manageTime(Stage primaryStage) {

        Timeline time = new Timeline();
        KeyFrame frame = new KeyFrame(Duration.seconds(1), event -> {

            secs--;

            int minutes = secs / 60;
            int leftSeconds = secs % 60;

            timerText.setText("Time: " + minutes + ":" + leftSeconds);
            if (secs <= 0) {
                primaryStage.setScene(setFinalPerspective(primaryStage));
                primaryStage.show();
            }
        });
        time.setCycleCount(Timeline.INDEFINITE);
        time.getKeyFrames().add(frame);
        time.stop();
        time.play();
    }


    /**
     * functie ce seteaza perspectiva finala (dupa terminarea quiz-ului )
     *
     * @param primaryStage -> stage-ul principala
     * @return -> the scene of the first label describinig the starting option for a new quiz
     */
    private Scene setFinalPerspective(Stage primaryStage) {

        Label lab2 = new Label("ENDE");
        Label lab = new Label();


        lab2.setMinSize(80, 80);
        lab2.setStyle("-fx-font-size:40");
        lab.setMinSize(40, 80);
        lab.setStyle("-fx-font-size:20");


        Button restartButt = new Button("RESTART");
        restartButt.setMinSize(70, 70);
        restartButt.setStyle("-fx-font-size:50");
        restartButt.setOnAction(e -> {
            try {
                start(primaryStage);
                new Thread(() -> manageTime(primaryStage)).start();

                manageTime(primaryStage);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        if (quizContr.getWrongAnswers() == 5 || (secs <= 0 && quizContr.getRightAnswers() < 22))
            lab.setText("Durchgefallen");
        else
            lab.setText("Fuhrerschein genommen!");


        Button finishButt = new Button("ENDE");
        finishButt.setMinSize(70, 70);
        finishButt.setStyle("-fx-font-size:50");
        finishButt.setOnAction(e -> System.exit(0));


        VBox schema2 = new VBox(30);
        score.setMinSize(70, 70);
        score.setStyle("-fx-font-size:25");
        schema2.getChildren().addAll(lab2, lab, restartButt, finishButt, score);
        schema2.setAlignment(Pos.CENTER);
        return new Scene(schema2, 800, 600);
    }

    /**
     * functie ce afiseaza butoanele
     */
    private void displayButts() {

        frage = new Button(question.getId() + ". " + question.getQuestion());

        butt = new Button("A. " + question.getAnswers().get(0) +
                "\nB. " + question.getAnswers().get(1) +
                "\nC. " + question.getAnswers().get(2));
        butt1 = new Button("A");
        butt2 = new Button("B");
        butt3 = new Button("C");

        next = new Button("NEXT");
        score = new Button("CORRECT: " + quizContr.getRightAnswers() + "\nWRONG: " + quizContr.getWrongAnswers());
        corrButt = new Button();
    }

    /**
     * functie ce se ocupa e formatarea vizula a butoanelor (design)
     */
    private void buttsFormats() {

        butt.setStyle("-fx-font-size:20");

        butt1.setMinSize(75, 75);
        butt2.setMinSize(75, 75);
        butt3.setMinSize(75, 75);

        frage.setMinSize(75, 75);
        frage.setStyle("-fx-font-size:20");

        next.setMinSize(75, 75);
        next.setStyle("-fx-font-size:40");

        timerText.setMinSize(75, 75);
        timerText.setStyle("-fx-font-size:30");

        butt1.setStyle("-fx-font-size:50");
        butt2.setStyle("-fx-font-size:50");
        butt3.setStyle("-fx-font-size:50");

    }

    /**
     * schimba formatul paginii de inceput
     *
     * @param primaryStage -> stage-ul principal
     * @param scene        -> "scena" quiz-ului
     */
    private void startPane(Stage primaryStage, Scene scene) {

        Label lab1 = new Label("Fuhrerscheinfragebogen");
        lab1.setMinSize(55, 55);
        lab1.setStyle("-fx-font-size:25");

        Button startButt = new Button("START");
        startButt.setMinSize(55, 55);
        startButt.setStyle("-fx-font-size:45");
        startButt.setOnAction(e -> {
            primaryStage.setScene(scene);
            new Thread(() -> manageTime(primaryStage)).start();
        });

        VBox schema1 = new VBox(25);
        schema1.getChildren().addAll(lab1, startButt);
        schema1.setAlignment(Pos.CENTER);

        Scene scene1 = new Scene(schema1, 900, 700);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    /**
     * private function for setting the padding of the app
     *
     * @param primaryStage -> stage-ul principal a aplicatiei
     * @param schema       -> schema ce contine butoanele (cum sunt ele aranjate)
     * @param schema2     -> alta schema
     */
    private void setPadding(Stage primaryStage, BorderPane schema, GridPane schema2) {

        HBox hbox = new HBox(50);
        hbox.setPadding(new Insets(50, 50, 50, 50));
        hbox.getChildren().addAll(butt1, butt2, butt3, next, score);
        hbox.setAlignment(Pos.CENTER);

        HBox hbox1 = new HBox(20);
        hbox1.setPadding(new Insets(10, 10, 10, 10));
        hbox1.getChildren().addAll(timerText);
        hbox1.setAlignment(Pos.CENTER);

        schema.setTop(hbox1);

        schema2.setAlignment(Pos.CENTER);
        schema2.add(frage, 1, 1);
        schema2.add(butt, 1, 2);

        schema.setCenter(schema2);
        schema.setBottom(hbox);
        primaryStage.setTitle("Chestionar auto");
    }

    /**
     * functie ce verifica statusul quiz-ului
     *
     * @param primaryStage -> stage-ul principal a aplicatiei
     */
    private void checkQuizStatus(Stage primaryStage) {

        if (question == null || quizContr.getWrongAnswers() == 5) {
            primaryStage.setScene(setFinalPerspective(primaryStage));
            primaryStage.show();
        }

        score.setText("CORRECT: " + quizContr.getRightAnswers() + "\nWRONG: " + quizContr.getWrongAnswers());
        frage.setText(question.getId() + ". " + question.getQuestion());
        butt.setText("A. " + question.getAnswers().get(0) +
                "\nB. " + question.getAnswers().get(1) +
                "\nC. " + question.getAnswers().get(2));
        corrButt = quizContr.setCorrectButt(question, butt1, butt2, butt3);
        correct = false;
    }


}
