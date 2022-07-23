package com.company;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ranking  {
    Button btn;
    ListView<String> rank;
    Group rankRoot;
    Scene rankScene;
    String[] rankingList,polaczonyWParyRanking;

    public Ranking(Menu menu) throws FileNotFoundException {

        btn = new Button("",new ImageView(new Image(new FileInputStream("src/com/company/graphic/exitButton.png"))));
        btn.setLayoutX(60);
        btn.setLayoutY(430);

        new RankingControler(this,menu);

        rank = new ListView<>();
        rank.getItems().addAll(polaczonyWParyRanking);
        rank.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        rank.setPrefSize(240,400);
        rank.setLayoutX(15);
        rank.setLayoutY(15);

        rankRoot = new Group();
        rankRoot.getChildren().addAll(rank,btn);


        rankScene = new Scene(rankRoot,270,500, Color.rgb(190,190,190));
    }
}
