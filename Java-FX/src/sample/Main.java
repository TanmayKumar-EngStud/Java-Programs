package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.event.ActionListener;
// We will add more things later on...

public class Main extends Application {
    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Hello World");
        button = new Button("Click me!!");
        StackPane root = new StackPane();
        root.getChildren().add(button);

        button.setOnAction(e -> System.out.println("Button Clicked!!"));


        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
