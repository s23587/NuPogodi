package com.company;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Game {

    ImageView backGround,wolfLeftUp,wolfLeftDown,wolfRightUp,wolfRightDown,brokenEgg1,brokenEgg2,brokenEgg3,
            cyfra0,cyfra1,cyfra2,cyfra3,cyfra4,cyfra5,cyfra6,cyfra7,cyfra8,cyfra9,
            cyfra10,cyfra11,cyfra12,cyfra13,cyfra14,cyfra15,cyfra16,cyfra17,cyfra18,cyfra19,
            cyfra20,cyfra21,cyfra22,cyfra23,cyfra24,cyfra25,cyfra26,cyfra27,cyfra28,cyfra29;
    Button leftDown,rightUp,leftUp,rightDown,start,backToMenu,submit;
    Circle circle;
    Group gameRoot,exitGame;
    Scene gameScene,exitGameScene;
    DialogPane dp;
    TextField userTextField;

    public Game(Menu menu) throws FileNotFoundException {


        submit = new Button("Potwierdź");
        submit.setLayoutX(100);
        submit.setLayoutY(80);
        dp = new DialogPane();
        dp.setContentText("");
        dp.setLayoutX(0);
        dp.setLayoutY(0);
        userTextField = new TextField();
        userTextField.setLayoutX(60);
        userTextField.setLayoutY(50);
        exitGame = new Group(dp,userTextField,submit);
        exitGameScene = new Scene(exitGame,270,130,Color.rgb(244,244,244));

        backGround = new ImageView(new Image(new FileInputStream("src/com/company/graphic/newGamePlayBackGround.jpg")));
        wolfLeftUp = new ImageView(new Image(new FileInputStream("src/com/company/graphic/WolfLeftUp.png")));
        wolfLeftDown = new ImageView(new Image(new FileInputStream("src/com/company/graphic/WolfLeftDown.png")));
        wolfRightUp = new ImageView(new Image(new FileInputStream("src/com/company/graphic/WolfRighUp.png")));
        wolfRightDown = new ImageView(new Image(new FileInputStream("src/com/company/graphic/WolfRightDown.png")));
        brokenEgg1 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/BrokenEgg.png")));
        brokenEgg2 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/BrokenEgg.png")));
        brokenEgg3 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/BrokenEgg.png")));

        cyfra0 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberZero.png")));
        cyfra1 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberOne.png")));
        cyfra2 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberTwo.png")));
        cyfra3 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberThree.png")));
        cyfra4 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberFour.png")));
        cyfra5 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberFive.png")));
        cyfra6 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberSix.png")));
        cyfra7 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberSeven.png")));
        cyfra8 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberEight.png")));
        cyfra9 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberNine.png")));

        cyfra10 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberZero.png")));
        cyfra11 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberOne.png")));
        cyfra12 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberTwo.png")));
        cyfra13 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberThree.png")));
        cyfra14 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberFour.png")));
        cyfra15 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberFive.png")));
        cyfra16 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberSix.png")));
        cyfra17 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberSeven.png")));
        cyfra18 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberEight.png")));
        cyfra19 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberNine.png")));

        cyfra20 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberZero.png")));
        cyfra21 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberOne.png")));
        cyfra22 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberTwo.png")));
        cyfra23 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberThree.png")));
        cyfra24 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberFour.png")));
        cyfra25 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberFive.png")));
        cyfra26 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberSix.png")));
        cyfra27 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberSeven.png")));
        cyfra28 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberEight.png")));
        cyfra29 = new ImageView(new Image(new FileInputStream("src/com/company/graphic/numberNine.png")));

        cyfra0.setVisible(false);
        cyfra1.setVisible(false);
        cyfra2.setVisible(false);
        cyfra3.setVisible(false);
        cyfra4.setVisible(false);
        cyfra5.setVisible(false);
        cyfra6.setVisible(false);
        cyfra7.setVisible(false);
        cyfra8.setVisible(false);
        cyfra9.setVisible(false);

        cyfra10.setVisible(false);
        cyfra11.setVisible(false);
        cyfra12.setVisible(false);
        cyfra13.setVisible(false);
        cyfra14.setVisible(false);
        cyfra15.setVisible(false);
        cyfra16.setVisible(false);
        cyfra17.setVisible(false);
        cyfra18.setVisible(false);
        cyfra19.setVisible(false);

        cyfra20.setVisible(false);
        cyfra21.setVisible(false);
        cyfra22.setVisible(false);
        cyfra23.setVisible(false);
        cyfra24.setVisible(false);
        cyfra25.setVisible(false);
        cyfra26.setVisible(false);
        cyfra27.setVisible(false);
        cyfra28.setVisible(false);
        cyfra29.setVisible(false);

        brokenEgg1.setX(640);
        brokenEgg1.setY(140);
        brokenEgg2.setX(700);
        brokenEgg2.setY(140);
        brokenEgg3.setX(760);
        brokenEgg3.setY(140);
        brokenEgg1.setVisible(false);
        brokenEgg2.setVisible(false);
        brokenEgg3.setVisible(false);

        backGround.setX(2);
        backGround.setY(2);
        backGround.setFitWidth(1150);
        backGround.setFitHeight(719);

        wolfLeftUp.setX(220+212);
        wolfLeftUp.setY(220+83);
        wolfLeftUp.setFitWidth(227);
        wolfLeftUp.setFitHeight(237);
        wolfLeftUp.setVisible(true);

        wolfLeftDown.setX(220+212);
        wolfLeftDown.setY(220+83);
        wolfLeftDown.setFitWidth(227);
        wolfLeftDown.setFitHeight(237);
        wolfLeftDown.setPreserveRatio(true);
        wolfLeftDown.setVisible(false);

        wolfRightUp.setX(300+212);
        wolfRightUp.setY(220+83);
        wolfRightUp.setFitWidth(227);
        wolfRightUp.setFitHeight(237);
        wolfRightUp.setPreserveRatio(true);
        wolfRightUp.setVisible(false);

        wolfRightDown.setX(300+212);
        wolfRightDown.setY(220+83);
        wolfRightDown.setFitWidth(227);
        wolfRightDown.setFitHeight(237);
        wolfRightDown.setPreserveRatio(true);
        wolfRightDown.setVisible(false);

        circle = new Circle();
        circle.setRadius(80);

        backToMenu = new Button("End");
        backToMenu.setPrefWidth(80);
        backToMenu.setPrefHeight(27);
        backToMenu.setLayoutX(1020);
        backToMenu.setLayoutY(160);

        start = new Button("Start");
        start.setPrefWidth(80);
        start.setPrefHeight(27);
        start.setLayoutX(1020);
        start.setLayoutY(70);

        leftUp = new Button("");
        leftUp.setPrefWidth(60);
        leftUp.setPrefHeight(60);
        leftUp.setLayoutX(88);
        leftUp.setLayoutY(449.5);
        leftUp.setShape(circle);

        leftDown = new Button("");
        leftDown.setPrefWidth(60);
        leftDown.setPrefHeight(60);
        leftDown.setLayoutX(88);
        leftDown.setLayoutY(581);
        leftDown.setShape(circle);

        rightUp = new Button("");
        rightUp.setPrefWidth(60);
        rightUp.setPrefHeight(60);
        rightUp.setLayoutX(1008);
        rightUp.setLayoutY(448.5);
        rightUp.setShape(circle);

        rightDown = new Button("");
        rightDown.setPrefWidth(60);
        rightDown.setPrefHeight(60);
        rightDown.setLayoutX(1008);
        rightDown.setLayoutY(581);
        rightDown.setShape(circle);

        gameRoot = new Group(backGround,wolfLeftDown,wolfLeftUp,wolfRightDown,wolfRightUp,leftUp,leftDown,rightUp,rightDown,
                start,backToMenu,brokenEgg1,brokenEgg2,brokenEgg3,cyfra0,cyfra1,cyfra2,cyfra3,cyfra4,cyfra5,cyfra6,cyfra7,
                cyfra8,cyfra9,cyfra10,cyfra11,cyfra12,cyfra13,cyfra14,cyfra15,cyfra16,cyfra17,cyfra18,cyfra19,
                cyfra20,cyfra21,cyfra22,cyfra23,cyfra24,cyfra25,cyfra26,cyfra27,cyfra28,cyfra29);
        gameScene = new Scene(gameRoot,1150,719,Color.rgb(190,190,190));

        new GameControler(this,menu);
    }
}
