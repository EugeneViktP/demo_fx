package edu.javacourse.net;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;



public class Main extends Application {

//    Button button;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Title of the Window");
//        button = new Button("Click me");
//
//        button.setOnAction(e -> {
//            System.out.println("Hello");
//            System.out.println("Hello you");
//
//        });
//
//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
//        Scene scene = new Scene(layout, 300, 250);
        Group root = new Group();
        Scene scene = new Scene(root,Color.GREEN);
        Image icon = new Image("images/minion.png");
        stage.getIcons().add(icon);
        stage.setTitle("New window");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setScene(scene);
        stage.show();
//    }

}}























