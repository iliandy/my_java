package com.iandyli;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calcScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calcScore(gameOver, score, levelCompleted, bonus);

        String playerName = "Bo";
        int position = 3;
        int playerScore = 1500;

        displayHighScorePosition(playerName, position);
        System.out.println(calculateHighScorePosition(playerScore));


        int highScore = calculateHighScorePosition(1200);
        displayHighScorePosition("Player1", highScore);

        highScore = calculateHighScorePosition(800);
        displayHighScorePosition("Player2", highScore);

        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Player3", highScore);

        highScore = calculateHighScorePosition(80);
        displayHighScorePosition("Player4", highScore);
    }

    public static int calcScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;
    }

    // Create a method called displayHighScorePosition
    // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an in
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and < 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }
        else if (500 <= playerScore && playerScore < 1000) {
            return 2;
        }
        else if (100 <= playerScore && playerScore < 500) {
            return 3;
        }
        else {
            return 4;
        }
    }

}
