package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Label label = new Label("Hello JavaFX!");
        BorderPane pane = new BorderPane();
        pane.setCenter(label);
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        /*
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        */
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
