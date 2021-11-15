/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Victor Urena
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class ToDoListMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // parent root is the ToDoListPage file
        //create a new scene
        //attach the root to the scene

        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ToDoListPage.fxml")));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("To Do App");
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
