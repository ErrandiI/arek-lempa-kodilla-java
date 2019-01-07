package com.kodilla.rps;

public class Game {
    private String username;
    private int roundsCount;
    private int gameVersion;
    private int difficultyLevel;

    public void startGame() {
        username = UserDialogs.getUserName();
        roundsCount = UserDialogs.getRounds();
        gameVersion = UserDialogs.getVersion();
        difficultyLevel=UserDialogs.getDifficulty();
        UserDialogs.showSettledFields(username, roundsCount);
        while (!playOneGame(roundsCount, gameVersion, difficultyLevel) ||
                UserDialogs.newGameAfterGame()){
        }
    }

    public boolean playOneGame(int roundsCount, int gameVersion, int difficultyLevel) {
        int playerWins = 0;
        int computerWins = 0;
        int gameRoundsCounter = 0;
        while (gameRoundsCounter < roundsCount) {
            Computer computer = new Computer();
            UserSelection playerMove;
            if(gameVersion == 0) {
                playerMove = UserDialogs.getUserSelection();
            } else {
                playerMove = UserDialogs.getUserSelectionExtended();
            }
            UserSelection computerMove = computer.getComputerMove(gameVersion, difficultyLevel, playerMove);
            if (playerMove == UserSelection.QUIT) {
                UserDialogs.quit();
            } else if (playerMove == UserSelection.NEW) {
                if (UserDialogs.newGame()){
                    return false;
                }
            } else {
                RoundResult roundResult = WinConditionCalculator.compareSelectedMoves(playerMove, computerMove);
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
        UserDialogs.showFinalStatistics(playerWins,computerWins);
        return true;
    }
}
