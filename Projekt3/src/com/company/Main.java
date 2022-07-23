package com.company;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        new Menu(stage);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
