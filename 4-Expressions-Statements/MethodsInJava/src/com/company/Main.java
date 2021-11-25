package com.company;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Kiranpal Singh" , calculateHighScorePosition(1500));
        displayHighScorePosition("Amanpal Singh" , calculateHighScorePosition(900));
        displayHighScorePosition("Tom" , calculateHighScorePosition(400));
        displayHighScorePosition("John" , calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String name, int posInHighScoresTable) {
        String ans = name + " managed to get into position "
                     + posInHighScoresTable + " in points table";
        System.out.println(ans);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore > 1000) return 1;
        else if( playerScore > 500 && playerScore < 1000) return  2;
        else if( playerScore > 100 && playerScore < 500) return 3;
        else return 4;
    }
}
