package com.kodilla.rps;

import java.util.Random;

public class Computer {
    public UserSelection getComputerMove(int gameVersion, int difficultyLevel, UserSelection playerMove) {
        Random generator = new Random();
        UserSelection computerMove = null;
        if (gameVersion == 0 && difficultyLevel == 0){
            int compMove = generator.nextInt(3);
            if (compMove == 1) {
                computerMove = UserSelection.ROCK;
            } else if (compMove == 2) {
                computerMove = UserSelection.PAPER;
            } else {
                computerMove = UserSelection.SCISSORS;
            }
        } else if (gameVersion == 1 && difficultyLevel == 0){
            int compMove = generator.nextInt(5);
            if (compMove == 1) {
                computerMove = UserSelection.ROCK;
            } else if (compMove == 2) {
                computerMove = UserSelection.PAPER;
            } else if (compMove == 3) {
                computerMove = UserSelection.LIZARD;
            } else if (compMove == 4) {
                computerMove = UserSelection.SPOCK;
            } else  {
                computerMove = UserSelection.SCISSORS;
            }
        } else if (gameVersion == 0 && difficultyLevel == 1) {
            int compMove = generator.nextInt(100);
            if (playerMove == UserSelection.ROCK) {
                if (compMove <= 25) {
                    computerMove = UserSelection.SCISSORS;
                } else if (compMove > 26 && compMove <= 50) {
                    computerMove = UserSelection.ROCK;
                } else {
                    computerMove = UserSelection.PAPER;
                }
            } else if (playerMove == UserSelection.PAPER) {
                if (compMove <= 25) {
                    computerMove = UserSelection.ROCK;
                } else if (compMove > 26 && compMove <= 50) {
                    computerMove = UserSelection.PAPER;
                } else {
                    computerMove = UserSelection.SCISSORS;
                }
            } else if (playerMove == UserSelection.SCISSORS) {
                if (compMove <= 25) {
                    computerMove = UserSelection.PAPER;
                } else if (compMove > 26 && compMove <= 50) {
                    computerMove = UserSelection.SCISSORS;
                } else {
                    computerMove = UserSelection.ROCK;
                }
            }

        } else {
            int compMove = generator.nextInt(100);
            if (playerMove == UserSelection.PAPER) {
                if (compMove <= 13) {
                    computerMove = UserSelection.SPOCK;
                } else if (compMove > 14 && compMove <= 25) {
                    computerMove = UserSelection.ROCK;
                } else if (compMove > 25 && compMove <= 50){
                    computerMove = UserSelection.PAPER;
                } else if (compMove >50 && compMove <= 75) {
                    computerMove = UserSelection.SCISSORS;
                } else {
                    computerMove = UserSelection.LIZARD;
                }
            } else if (playerMove == UserSelection.ROCK) {
                if (compMove <= 13) {
                    computerMove = UserSelection.LIZARD;
                } else if (compMove > 14 && compMove <= 25) {
                    computerMove = UserSelection.SCISSORS;
                } else if (compMove > 25 && compMove <= 50){
                    computerMove = UserSelection.ROCK;
                } else if (compMove > 50 && compMove <= 75) {
                    computerMove = UserSelection.PAPER;
                } else {
                    computerMove = UserSelection.SPOCK;
                }
            } else if (playerMove == UserSelection.SCISSORS) {
                if (compMove <= 13) {
                    computerMove = UserSelection.PAPER;
                } else if (compMove > 14 && compMove <= 25) {
                    computerMove = UserSelection.LIZARD;
                } else if (compMove > 25 && compMove <= 50){
                    computerMove = UserSelection.SCISSORS;
                } else if (compMove >50 && compMove <= 75) {
                    computerMove = UserSelection.SPOCK;
                } else {
                    computerMove = UserSelection.ROCK;
                }
            } else if (playerMove == UserSelection.SPOCK) {
                if (compMove <= 13) {
                    computerMove = UserSelection.SCISSORS;
                } else if (compMove > 14 && compMove <= 25) {
                    computerMove = UserSelection.ROCK;
                } else if (compMove > 25 && compMove <= 50){
                    computerMove = UserSelection.SPOCK;
                } else if (compMove >50 && compMove <= 75) {
                    computerMove = UserSelection.PAPER;
                } else {
                    computerMove = UserSelection.LIZARD;
                }
            } else {
                if (compMove <= 13) {
                    computerMove = UserSelection.SPOCK;
                } else if (compMove > 14 && compMove <= 25) {
                    computerMove = UserSelection.PAPER;
                } else if (compMove > 25 && compMove <= 50){
                    computerMove = UserSelection.LIZARD;
                } else if (compMove >50 && compMove <= 75) {
                    computerMove = UserSelection.SCISSORS;
                } else {
                    computerMove = UserSelection.ROCK;
                }
            }
        }
        return computerMove;
    }
}
