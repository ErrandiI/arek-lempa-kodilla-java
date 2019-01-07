package com.kodilla.rps;

public class WinConditionCalculator {

    public static RoundResult compareSelectedMoves(UserSelection playerMove, UserSelection computerMove) {
        if (playerMove == UserSelection.ROCK && computerMove == UserSelection.SCISSORS) {
            return RoundResult.PLAYERWIN;
        } else if (playerMove == UserSelection.ROCK && computerMove == UserSelection.SPOCK) {
            return RoundResult.COMPUTERWIN;
        } else if (playerMove == UserSelection.ROCK && computerMove == UserSelection.LIZARD) {
            return RoundResult.PLAYERWIN;
        } else if (playerMove == UserSelection.ROCK && computerMove == UserSelection.PAPER) {
            return  RoundResult.COMPUTERWIN;
        } else if (playerMove == UserSelection.PAPER && computerMove == UserSelection.SCISSORS) {
            return RoundResult.COMPUTERWIN;
        } else if (playerMove == UserSelection.PAPER && computerMove == UserSelection.ROCK) {
            return RoundResult.PLAYERWIN;
        } else if (playerMove == UserSelection.PAPER && computerMove == UserSelection.SPOCK) {
                return RoundResult.PLAYERWIN;
        } else if (playerMove == UserSelection.PAPER && computerMove == UserSelection.LIZARD) {
                return RoundResult.COMPUTERWIN;
        } else if (playerMove == UserSelection.SCISSORS && computerMove == UserSelection.ROCK) {
            return RoundResult.COMPUTERWIN;
        } else if (playerMove == UserSelection.SCISSORS && computerMove == UserSelection.PAPER) {
            return RoundResult.PLAYERWIN;
        } else if (playerMove == UserSelection.SCISSORS && computerMove == UserSelection.SPOCK) {
            return RoundResult.COMPUTERWIN;
        } else if (playerMove == UserSelection.SCISSORS && computerMove == UserSelection.LIZARD) {
            return RoundResult.PLAYERWIN;
        } else if (playerMove == UserSelection.SPOCK && computerMove == UserSelection.ROCK) {
            return RoundResult.PLAYERWIN;
        } else if (playerMove == UserSelection.SPOCK && computerMove == UserSelection.PAPER) {
            return RoundResult.COMPUTERWIN;
        } else if (playerMove == UserSelection.SPOCK && computerMove == UserSelection.SCISSORS) {
            return RoundResult.PLAYERWIN;
        } else if (playerMove == UserSelection.SPOCK && computerMove == UserSelection.LIZARD) {
            return RoundResult.COMPUTERWIN;
        } else if (playerMove == UserSelection.LIZARD && computerMove == UserSelection.ROCK) {
            return RoundResult.COMPUTERWIN;
        } else if (playerMove == UserSelection.LIZARD && computerMove == UserSelection.PAPER) {
            return RoundResult.PLAYERWIN;
        } else if (playerMove == UserSelection.LIZARD && computerMove == UserSelection.SCISSORS) {
            return RoundResult.COMPUTERWIN;
        } else if (playerMove == UserSelection.LIZARD && computerMove == UserSelection.SPOCK) {
            return RoundResult.PLAYERWIN;
        } else {
            return RoundResult.TIE;
        }
    }
}
