package com.company;

import java.io.FileReader;
import java.io.IOException;

public class RankingControler {

    String ranking="";

    public void odczyt() throws IOException {
        FileReader odczytacz = new FileReader("ranking.txt");
        int o = odczytacz.read();
        ranking="";
        while(o!=-1){
            ranking= ranking+(char)o;
            o=odczytacz.read();
        }
        odczytacz.close();
    }

    void bubbleSort(String[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 1; j < n-i-1; j+=2)
                if (Integer.parseInt(arr[j]) < Integer.parseInt(arr[j+2]))
                {
                    String tempNick = arr[j-1];
                    String tempScore = arr[j];
                    arr[j-1] = arr[j+1];
                    arr[j] = arr[j+2];
                    arr[j+1]=tempNick;
                    arr[j+2]=tempScore;
                }
    }

    public RankingControler(Ranking ranking, Menu menu){

        ranking.btn.setOnAction((event) -> menu.stage.setScene(menu.menuScene));

        try {
            odczyt();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        ranking.rankingList= this.ranking.split("\t");
        bubbleSort(ranking.rankingList);
        ranking.polaczonyWParyRanking = new String[ranking.rankingList.length/2];

        for(int i =0; i< ranking.polaczonyWParyRanking.length;i++){
            ranking.polaczonyWParyRanking[i]=(i+1)+".Gracz: "+ranking.rankingList[i*2]+","+"\t"+" pkt: "+ranking.rankingList[(i*2)+1];
        }

    }
}

