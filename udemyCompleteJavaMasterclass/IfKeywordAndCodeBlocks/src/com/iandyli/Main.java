package com.iandyli;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
//	      Print out a second score on screen with following:
//        score set to 10000
//        levelCompleted set to 8
//        bonus set to 200
//        But make sure first printout above still displays as well

        int myScore = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = myScore + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
