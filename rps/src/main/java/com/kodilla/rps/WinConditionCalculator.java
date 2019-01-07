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

    public static void game(int roundsCount, int gameVersion) {
        int playerWins = 0;
        int computerWins = 0;
        int gameRoundsCounter = 0;
        while (gameRoundsCounter < roundsCount) {
            if (gameVersion == 0) {
                Computer computer = new Computer();
                UserSelection playerMove = UserDialogs.getUserSelection();
                UserSelection computerMove = computer.getComputerMove(gameVersion);
                if (playerMove == UserSelection.QUIT) {
                    UserDialogs.quit();
                } else if (playerMove == UserSelection.NEW) {
                    UserDialogs.newGame();
                } else {
                    RoundResult roundResult = compareSelectedMoves(playerMove, computerMove);
                    gameRoundsCounter++;
                    if (roundResult == RoundResult.TIE) {
                        UserDialogs.showMoves(playerMove, computerMove, roundResult);
                    } else if (roundResult == RoundResult.PLAYERWIN) {
                        UserDialogs.showMoves(playerMove, computerMove, roundResult);
                        playerWins++;
                    } else {
                        UserDialogs.showMoves(playerMove, computerMove, roundResult);
                        computerWins++;
                    }
                    UserDialogs.showStatistics(playerWins, computerWins, gameRoundsCounter);
                }
            } else {
                Computer computer = new Computer();
                UserSelection playerMove = UserDialogs.getUserSelectionExtended();
                UserSelection computerMove = computer.getComputerMove(gameVersion);
                if (playerMove == UserSelection.QUIT) {
                    UserDialogs.quit();
                } else if (playerMove == UserSelection.NEW) {
                    UserDialogs.newGame();
                } else {
                    RoundResult roundResult = compareSelectedMoves(playerMove, computerMove);
                    gameRoundsCounter++;
                    if (roundResult == RoundResult.TIE) {
                        UserDialogs.showMoves(playerMove, computerMove, roundResult);
                    } else if (roundResult == RoundResult.PLAYERWIN) {
                        UserDialogs.showMoves(playerMove, computerMove, roundResult);
                        playerWins++;
                    } else {
                        UserDialogs.showMoves(playerMove, computerMove, roundResult);
                        computerWins++;
                    }
                    UserDialogs.showStatistics(playerWins, computerWins, gameRoundsCounter);
                }
            }
        }
        UserDialogs.showFinalStatistics(playerWins,computerWins);
    }

}
