package com.company;

import javafx.animation.*;
import javafx.application.Platform;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;


public class GameControler {
    KeyCombination cntrlShiftQ;
    Thread gra;
    Ellipse egg;
    RotateTransition rotateTransition;
    PathTransition pathTransition;
    Path path;
    ParallelTransition pq;
    SequentialTransition sq;
    FadeTransition fd;
    int wylosowanyKurnik,counter,speed=2500,zlapane=0,upusczone=0,pozycjaWilka=1;
    double animationSpeed=4;
    boolean isStarted=false;
    Vector<ImageView> cyfry = new Vector<>();

    public void zapis(String nick, int pkt) throws IOException {
        FileWriter out = new FileWriter("ranking.txt",true);
        out.write(nick+"\t"+pkt+"\t");
        out.close();
    }

    public void showWolf(ImageView showedWolf){
        showedWolf.setVisible(true);
    }

    public void hideWolfs(ImageView hiddenWolf1,ImageView hiddenWolf2,ImageView hiddenWolf3){
        hiddenWolf1.setVisible(false);
        hiddenWolf2.setVisible(false);
        hiddenWolf3.setVisible(false);
    }

    public void brokenEggAnimation(Game game){
        if(upusczone==1){
            game.brokenEgg1.setVisible(true);
        }else if(upusczone==2){
            game.brokenEgg2.setVisible(true);
        }else if(upusczone==3){
            game.brokenEgg3.setVisible(true);
        }
    }

    public void leftUpEggAnimation(Game game){
        egg= new Ellipse(400,400,16,23);
        rotateTransition = new RotateTransition(Duration.seconds(animationSpeed),egg);
        rotateTransition.setFromAngle(-45);
        rotateTransition.setToAngle(90);

        pathTransition = new PathTransition(Duration.seconds(animationSpeed),egg);
        path = new Path();
        path.getElements().add(new MoveTo(270,230));
        path.getElements().add(new LineTo(485,380));
        pathTransition.setNode(egg);
        pathTransition.setPath(path);

        pq = new ParallelTransition();
        pq.getChildren().addAll(rotateTransition,pathTransition);

        fd = new FadeTransition(Duration.seconds(0.001),egg);
        fd.setFromValue(1.0);
        fd.setToValue(0.0);

        sq = new SequentialTransition();
        sq.getChildren().addAll(pq,fd);
        sq.play();
        sq.setOnFinished((checkWolfPosition)-> {
            if(isStarted) {
                if (pozycjaWilka == 1) {
                    zlapane++;
                    licznikJajekAnimation(zlapane);
                } else {
                    upusczone++;
                    brokenEggAnimation(game);
                    speed = 2500;
                    animationSpeed = 4;
                }
            }
        });

        game.gameRoot.getChildren().add(egg);
    }
    public void rightUpEggAnimation(Game game){
        egg= new Ellipse(400,400,16,23);
        rotateTransition = new RotateTransition(Duration.seconds(animationSpeed),egg);
        rotateTransition.setFromAngle(45);
        rotateTransition.setToAngle(-90);

        pathTransition = new PathTransition(Duration.seconds(animationSpeed),egg);
        path = new Path();
        path.getElements().add(new MoveTo(850,230));
        path.getElements().add(new LineTo(690,380));
        pathTransition.setNode(egg);
        pathTransition.setPath(path);

        pq = new ParallelTransition();
        pq.getChildren().addAll(rotateTransition,pathTransition);

        fd = new FadeTransition(Duration.seconds(0.001),egg);
        fd.setFromValue(1.0);
        fd.setToValue(0.0);

        sq = new SequentialTransition();
        sq.getChildren().addAll(pq,fd);
        sq.play();
        sq.setOnFinished((checkWolfPosition)-> {
            if(isStarted) {
                if (pozycjaWilka == 3) {
                    zlapane++;
                    licznikJajekAnimation(zlapane);
                } else {
                    upusczone++;
                    brokenEggAnimation(game);
                    speed = 2500;
                    animationSpeed = 4;
                }
            }
        });

        game.gameRoot.getChildren().add(egg);
    }
    public void rightDownEggAnimation(Game game){
        egg= new Ellipse(400,400,16,23);
        rotateTransition = new RotateTransition(Duration.seconds(animationSpeed),egg);
        rotateTransition.setFromAngle(45);
        rotateTransition.setToAngle(-90);

        pathTransition = new PathTransition(Duration.seconds(animationSpeed),egg);
        path = new Path();
        path.getElements().add(new MoveTo(870,370));
        path.getElements().add(new LineTo(675,455));
        pathTransition.setNode(egg);
        pathTransition.setPath(path);

        pq = new ParallelTransition();
        pq.getChildren().addAll(rotateTransition,pathTransition);

        fd = new FadeTransition(Duration.seconds(0.001),egg);
        fd.setFromValue(1.0);
        fd.setToValue(0.0);

        sq = new SequentialTransition();
        sq.getChildren().addAll(pq,fd);
        sq.play();
        sq.setOnFinished((checkWolfPosition)-> {
            if(isStarted) {
                if (pozycjaWilka == 4) {
                    zlapane++;
                    licznikJajekAnimation(zlapane);
                } else {
                    upusczone++;
                    brokenEggAnimation(game);
                    speed = 2500;
                    animationSpeed = 4;
                }
            }
        });

        game.gameRoot.getChildren().add(egg);
    }
    public void leftDownEggAnimation(Game game){
        egg= new Ellipse(400,400,16,23);
        rotateTransition = new RotateTransition(Duration.seconds(animationSpeed),egg);
        rotateTransition.setFromAngle(-45);
        rotateTransition.setToAngle(90);

        pathTransition = new PathTransition(Duration.seconds(animationSpeed),egg);
        path = new Path();
        path.getElements().add(new MoveTo(300,380));
        path.getElements().add(new LineTo(500,450));
        pathTransition.setNode(egg);
        pathTransition.setPath(path);

        pq = new ParallelTransition();
        pq.getChildren().addAll(rotateTransition,pathTransition);

        fd = new FadeTransition(Duration.seconds(0.001),egg);
        fd.setFromValue(1.0);
        fd.setToValue(0.0);

        sq = new SequentialTransition();
        sq.getChildren().addAll(pq,fd);
        sq.play();
        sq.setOnFinished((checkWolfPosition)-> {
            if(isStarted) {
                if (pozycjaWilka == 2) {
                    zlapane++;
                    licznikJajekAnimation(zlapane);
                } else {
                    upusczone++;
                    brokenEggAnimation(game);
                    speed = 2500;
                    animationSpeed = 4;
                }
            }
        });

        game.gameRoot.getChildren().add(egg);
    }

    private void licznikJajekAnimation(int iloscZlapanychJajek) {
        double przedzial = (double) iloscZlapanychJajek / 10;
        if (przedzial < 1) {
            cyfry.elementAt(iloscZlapanychJajek).setVisible(true);
            cyfry.elementAt(iloscZlapanychJajek).setX(560);
            cyfry.elementAt(iloscZlapanychJajek).setY(140);
            for (int i = 0; i < cyfry.size(); i++) {
                if (i != iloscZlapanychJajek) {
                    cyfry.elementAt(i).setVisible(false);
                }
            }
        } else if (przedzial >= 1 && przedzial < 10) {
            if (iloscZlapanychJajek / 10 != iloscZlapanychJajek % 10) {
                cyfry.elementAt(iloscZlapanychJajek / 10).setVisible(true);
                cyfry.elementAt(iloscZlapanychJajek / 10).setX(500);
                cyfry.elementAt(iloscZlapanychJajek / 10).setY(140);

                cyfry.elementAt(iloscZlapanychJajek % 10).setVisible(true);
                cyfry.elementAt(iloscZlapanychJajek % 10).setX(560);
                cyfry.elementAt(iloscZlapanychJajek % 10).setY(140);

                for (int i = 0; i < cyfry.size(); i++) {
                    if (i != iloscZlapanychJajek % 10 && i != iloscZlapanychJajek / 10) {
                        cyfry.elementAt(i).setVisible(false);
                    }
                }
            } else if (iloscZlapanychJajek / 10 == iloscZlapanychJajek % 10) {
                cyfry.elementAt(iloscZlapanychJajek / 10).setVisible(true);
                cyfry.elementAt(iloscZlapanychJajek / 10).setX(500);
                cyfry.elementAt(iloscZlapanychJajek / 10).setY(140);

                cyfry.elementAt((iloscZlapanychJajek / 10) + 10).setVisible(true);
                cyfry.elementAt((iloscZlapanychJajek / 10) + 10).setX(560);
                cyfry.elementAt((iloscZlapanychJajek / 10) + 10).setY(140);

                for (int i = 0; i < cyfry.size(); i++) {
                    if (i != iloscZlapanychJajek % 10 && i != (iloscZlapanychJajek / 10) + 10) {
                        cyfry.elementAt(i).setVisible(false);
                    }
                }
            }
        } else if (przedzial >= 10 && przedzial < 100) {
            if (iloscZlapanychJajek / 100 == (iloscZlapanychJajek % 100)/10) {
                if(iloscZlapanychJajek/100==iloscZlapanychJajek%10){
                    cyfry.elementAt(iloscZlapanychJajek / 100).setVisible(true);
                    cyfry.elementAt(iloscZlapanychJajek / 100).setX(440);
                    cyfry.elementAt(iloscZlapanychJajek / 100).setY(140);

                    cyfry.elementAt((iloscZlapanychJajek / 100) + 10).setVisible(true);
                    cyfry.elementAt((iloscZlapanychJajek / 100) + 10).setX(500);
                    cyfry.elementAt((iloscZlapanychJajek / 100) + 10).setY(140);

                    cyfry.elementAt((iloscZlapanychJajek / 100) + 20).setVisible(true);
                    cyfry.elementAt((iloscZlapanychJajek / 100) + 20).setX(560);
                    cyfry.elementAt((iloscZlapanychJajek / 100) + 20).setY(140);

                    for (int i = 0; i < cyfry.size(); i++) {
                        if (i != iloscZlapanychJajek / 100 && i != ((iloscZlapanychJajek / 100) + 10) && i != ((iloscZlapanychJajek / 100) + 20)) {
                            cyfry.elementAt(i).setVisible(false);
                        }
                    }
                }else if(iloscZlapanychJajek/100!=iloscZlapanychJajek%10){
                    cyfry.elementAt(iloscZlapanychJajek / 100).setVisible(true);
                    cyfry.elementAt(iloscZlapanychJajek / 100).setX(440);
                    cyfry.elementAt(iloscZlapanychJajek / 100).setY(140);

                    cyfry.elementAt((iloscZlapanychJajek / 100) + 10).setVisible(true);
                    cyfry.elementAt((iloscZlapanychJajek / 100) + 10).setX(500);
                    cyfry.elementAt((iloscZlapanychJajek / 100) + 10).setY(140);

                    cyfry.elementAt(iloscZlapanychJajek%10).setVisible(true);
                    cyfry.elementAt(iloscZlapanychJajek%10).setX(560);
                    cyfry.elementAt(iloscZlapanychJajek%10).setY(140);

                    for (int i = 0; i < cyfry.size(); i++) {
                        if (i != iloscZlapanychJajek / 100 && i != ((iloscZlapanychJajek / 100) + 10) && i != iloscZlapanychJajek%10) {
                            cyfry.elementAt(i).setVisible(false);
                        }
                    }
                }
            } else if (iloscZlapanychJajek / 100 != (iloscZlapanychJajek % 100)/10) {
                if(iloscZlapanychJajek / 100 == iloscZlapanychJajek%10 && (iloscZlapanychJajek%100)/10!=iloscZlapanychJajek%10){
                    cyfry.elementAt(iloscZlapanychJajek / 100).setVisible(true);
                    cyfry.elementAt(iloscZlapanychJajek / 100).setX(440);
                    cyfry.elementAt(iloscZlapanychJajek / 100).setY(140);

                    cyfry.elementAt((iloscZlapanychJajek%100)/10).setVisible(true);
                    cyfry.elementAt((iloscZlapanychJajek%100)/10).setX(500);
                    cyfry.elementAt((iloscZlapanychJajek%100)/10).setY(140);

                    cyfry.elementAt((iloscZlapanychJajek / 100)+10).setVisible(true);
                    cyfry.elementAt((iloscZlapanychJajek / 100)+10).setX(560);
                    cyfry.elementAt((iloscZlapanychJajek / 100)+10).setY(140);

                    for (int i = 0; i < cyfry.size(); i++) {
                        if (i != iloscZlapanychJajek / 100 && i != ((iloscZlapanychJajek%100)/10) && i != ((iloscZlapanychJajek / 100)+10)) {
                            cyfry.elementAt(i).setVisible(false);
                        }
                    }
                }else if(iloscZlapanychJajek / 100 != iloscZlapanychJajek%10 && (iloscZlapanychJajek%100)/10==iloscZlapanychJajek%10){
                    cyfry.elementAt(iloscZlapanychJajek / 100).setVisible(true);
                    cyfry.elementAt(iloscZlapanychJajek / 100).setX(440);
                    cyfry.elementAt(iloscZlapanychJajek / 100).setY(140);

                    cyfry.elementAt((iloscZlapanychJajek%100)/10).setVisible(true);
                    cyfry.elementAt((iloscZlapanychJajek%100)/10).setX(500);
                    cyfry.elementAt((iloscZlapanychJajek%100)/10).setY(140);

                    cyfry.elementAt((iloscZlapanychJajek%100)/10+10).setVisible(true);
                    cyfry.elementAt((iloscZlapanychJajek%100)/10+10).setX(560);
                    cyfry.elementAt((iloscZlapanychJajek%100)/10+10).setY(140);

                    for (int i = 0; i < cyfry.size(); i++) {
                        if (i != iloscZlapanychJajek / 100 && i != ((iloscZlapanychJajek%100)/10) && i != ((iloscZlapanychJajek%100)/10+10)) {
                            cyfry.elementAt(i).setVisible(false);
                        }
                    }
                }else if(iloscZlapanychJajek / 100 != iloscZlapanychJajek%10 && (iloscZlapanychJajek%100)/10!=iloscZlapanychJajek%10){
                    cyfry.elementAt(iloscZlapanychJajek / 100).setVisible(true);
                    cyfry.elementAt(iloscZlapanychJajek / 100).setX(440);
                    cyfry.elementAt(iloscZlapanychJajek / 100).setY(140);

                    cyfry.elementAt((iloscZlapanychJajek%100)/10).setVisible(true);
                    cyfry.elementAt((iloscZlapanychJajek%100)/10).setX(500);
                    cyfry.elementAt((iloscZlapanychJajek%100)/10).setY(140);

                    cyfry.elementAt(iloscZlapanychJajek%10).setVisible(true);
                    cyfry.elementAt(iloscZlapanychJajek%10).setX(560);
                    cyfry.elementAt(iloscZlapanychJajek%10).setY(140);

                    for (int i = 0; i < cyfry.size(); i++) {
                        if (i != iloscZlapanychJajek / 100 && i != ((iloscZlapanychJajek%100)/10) && i != (iloscZlapanychJajek%10)) {
                            cyfry.elementAt(i).setVisible(false);
                        }
                    }
                }
            }
        }
    }

    public GameControler(Game game,Menu menu){

        {
            cyfry.add(game.cyfra0);
            cyfry.add(game.cyfra1);
            cyfry.add(game.cyfra2);
            cyfry.add(game.cyfra3);
            cyfry.add(game.cyfra4);
            cyfry.add(game.cyfra5);
            cyfry.add(game.cyfra6);
            cyfry.add(game.cyfra7);
            cyfry.add(game.cyfra8);
            cyfry.add(game.cyfra9);

            cyfry.add(game.cyfra10);
            cyfry.add(game.cyfra11);
            cyfry.add(game.cyfra12);
            cyfry.add(game.cyfra13);
            cyfry.add(game.cyfra14);
            cyfry.add(game.cyfra15);
            cyfry.add(game.cyfra16);
            cyfry.add(game.cyfra17);
            cyfry.add(game.cyfra18);
            cyfry.add(game.cyfra19);

            cyfry.add(game.cyfra20);
            cyfry.add(game.cyfra21);
            cyfry.add(game.cyfra22);
            cyfry.add(game.cyfra23);
            cyfry.add(game.cyfra24);
            cyfry.add(game.cyfra25);
            cyfry.add(game.cyfra26);
            cyfry.add(game.cyfra27);
            cyfry.add(game.cyfra28);
            cyfry.add(game.cyfra29);
        }

        gra=new Thread(()-> {
            try {
                while(isStarted) {
                    Thread.sleep(speed);
                    Platform.runLater(()-> {
                        wylosowanyKurnik = (int) (Math.random() * 4) + 1;
                        switch (wylosowanyKurnik){
                            case 1 -> {rightDownEggAnimation(game);counter++;}
                            case 2 -> {rightUpEggAnimation(game);counter++;}
                            case 3 -> {leftDownEggAnimation(game);counter++;}
                            case 4 -> {leftUpEggAnimation(game);counter++;}
                        }
                        if (counter%10==0){
                            if(speed>1000){
                                speed-=300;
                            }
                            if(animationSpeed>2){
                                animationSpeed-=0.25;
                            }
                        }
                        if(upusczone==4) {
                            game.dp.setContentText("Zdobyto "+ zlapane +" punktów. Brawo! Podaj swój nick:");
                            isStarted=false;
                            pozycjaWilka=10;
                            game.submit.setOnAction((e) -> {
                                String a = game.userTextField.getText();
                                try {
                                    zapis(a,zlapane);
                                } catch (IOException exception) {
                                    exception.printStackTrace();
                                }
                                menu.stage.close();
                            });
                            menu.stage.setScene(game.exitGameScene);
                        }

                    });
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        game.leftDown.setOnAction((event) -> {
            hideWolfs(game.wolfLeftUp,game.wolfRightDown,game.wolfRightUp);
            showWolf(game.wolfLeftDown);

            pozycjaWilka=2;
        });

        game.leftUp.setOnAction((event) -> {
            hideWolfs(game.wolfLeftDown,game.wolfRightDown,game.wolfRightUp);
            showWolf(game.wolfLeftUp);

            pozycjaWilka=1;
        });

        game.rightUp.setOnAction((event) -> {
            hideWolfs(game.wolfLeftDown,game.wolfRightDown,game.wolfLeftUp);
            showWolf(game.wolfRightUp);

            pozycjaWilka=3;
        });

        game.rightDown.setOnAction((event) -> {
            hideWolfs(game.wolfLeftDown,game.wolfLeftUp,game.wolfRightUp);
            showWolf(game.wolfRightDown);

            pozycjaWilka=4;
        });

        game.start.setOnAction((event) -> {
            if(!isStarted) {
                isStarted = true;
                gra.start();
            }
        });

        game.backToMenu.setOnAction((event) -> {
            game.dp.setContentText("Zdobyto "+ zlapane +" punktów. Brawo! Podaj swój nick:");
            pozycjaWilka=10;
            game.submit.setOnAction((e) -> {
                String a = game.userTextField.getText();
                try {
                    zapis(a,zlapane);
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
                menu.stage.close();
            });
            menu.stage.setScene(game.exitGameScene);
            isStarted=false;
        });


        cntrlShiftQ = new KeyCodeCombination(KeyCode.Q, KeyCodeCombination.CONTROL_DOWN, KeyCombination.SHIFT_DOWN);
        game.gameScene.setOnKeyPressed(event -> {
            if(cntrlShiftQ.match(event)){
                game.dp.setContentText("Zdobyto "+ zlapane +" punktów. Brawo! Podaj swój nick:");
                pozycjaWilka=10;
                game.submit.setOnAction((e) -> {
                    String a = game.userTextField.getText();
                    try {
                        zapis(a,zlapane);
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                    menu.stage.close();
                });
                menu.stage.setScene(game.exitGameScene);
                isStarted=false;
            }
            if(event.getCode() == KeyCode.G){
                hideWolfs(game.wolfLeftUp,game.wolfRightDown,game.wolfRightUp);
                showWolf(game.wolfLeftDown);

                pozycjaWilka=2;
            }
            if(event.getCode() == KeyCode.T){
                hideWolfs(game.wolfLeftDown,game.wolfRightDown,game.wolfRightUp);
                showWolf(game.wolfLeftUp);

                pozycjaWilka=1;
            }
            if(event.getCode() == KeyCode.U){
                hideWolfs(game.wolfLeftDown,game.wolfRightDown,game.wolfLeftUp);
                showWolf(game.wolfRightUp);

                pozycjaWilka=3;
            }
            if(event.getCode() == KeyCode.J){
                hideWolfs(game.wolfLeftDown,game.wolfLeftUp,game.wolfRightUp);
                showWolf(game.wolfRightDown);

                pozycjaWilka=4;
            }
            if(event.getCode() == KeyCode.S){
                if(!isStarted) {
                    isStarted = true;
                    gra.start();
                }
            }
        });

    }
}
