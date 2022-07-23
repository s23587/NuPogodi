package com.company;

import java.io.FileNotFoundException;

public class MenuControler {
    Game game;
    Ranking rank;
    public MenuControler(Menu menu) throws FileNotFoundException {

        game = new Game(menu);
        rank = new Ranking(menu);
        menu.newGame.setOnAction((event) -> menu.stage.setScene(game.gameScene));

        menu.ranking.setOnAction((event) -> menu.stage.setScene(rank.rankScene));

        menu.exit.setOnAction((event) -> menu.stage.close());
    }
}
