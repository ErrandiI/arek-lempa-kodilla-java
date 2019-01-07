package com.kodilla.rps;

import java.util.Random;

public class Computer {
    public UserSelection getComputerMove(int gameVersion) {
        Random generator = new Random();
        UserSelection computerMove = null;
        if (gameVersion == 0){
            int compMove = generator.nextInt(3);
            if (compMove == 1) {
                computerMove = UserSelection.ROCK;
            } else if (compMove == 2) {
                computerMove = UserSelection.PAPER;
            } else {
                computerMove = UserSelection.SCISSORS;
            }
        } else {
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
        }

        return computerMove;
    }
}
