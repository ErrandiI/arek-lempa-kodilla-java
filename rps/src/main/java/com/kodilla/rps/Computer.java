package com.kodilla.rps;

import java.util.Random;

public class Computer {
    public UserSelection getComputerMove() {
        Random generator = new Random();
        UserSelection computerMove = null;
        int compMove = generator.nextInt(3);
        if (compMove == 1) {
            computerMove = UserSelection.ROCK;
        } else if (compMove == 2) {
            computerMove = UserSelection.PAPER;
        } else {
            computerMove = UserSelection.SCISSORS;
        }
        return computerMove;
    }
}
