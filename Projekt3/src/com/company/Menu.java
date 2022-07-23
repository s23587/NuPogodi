package com.company;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Menu {
    Button newGame,ranking,exit;
    ImageView menuBackGround,newG,highScore,exitIV;
    Group menuRoot;
    Scene menuScene;
    Stage stage;

    public Menu(Stage stage) throws FileNotFoundException {
        this.stage=stage;

        menuBackGround = new ImageView(new Image(new FileInputStream("src/com/company/graphic/menuBG.png")));
        newG = new ImageView(new Image(new FileInputStream("src/com/company/graphic/newGameButton.png")));
        highScore = new ImageView(new Image(new FileInputStream("src/com/company/graphic/highScoresButton.png")));
        exitIV = new ImageView(new Image(new FileInputStream("src/com/company/graphic/exitButton.png")));

        menuBackGround.setX(0);
        menuBackGround.setY(0);
        menuBackGround.setFitWidth(712);
        menuBackGround.setFitHeight(490);

        newG.setFitWidth(278);
        newG.setFitHeight(93);

        newGame=new Button("",newG);
        newGame.setLayoutX(208.5);
        newGame.setLayoutY(74);

        highScore.setFitWidth(278);
        highScore.setFitHeight(93);

        ranking=new Button("",highScore);
        ranking.setLayoutX(208.5);
        ranking.setLayoutY(191);

        exitIV.setFitWidth(278);
        exitIV.setFitHeight(93);

        exit = new Button("",exitIV);
        exit.setLayoutX(208.5);
        exit.setLayoutY(310);

        menuRoot= new Group(menuBackGround,newGame,ranking,exit);
        menuScene = new Scene(menuRoot,712,490);

        this.stage.setTitle("Nu pogodi!");
        this.stage.setScene(menuScene);
        this.stage.setResizable(false);
        this.stage.setX(220);
        this.stage.setY(60);
        this.stage.getIcons().add((new Image(new FileInputStream("src/com/company/graphic/Egg.png"))));
        this.stage.show();

        new MenuControler(this);
    }
}
