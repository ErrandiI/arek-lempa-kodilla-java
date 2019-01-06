package com.kodilla.rps;

public class StartGame {

    public static void startGame() {
        UserDialogs userDialogs = new UserDialogs();
        userDialogs.nameSetter();
        userDialogs.roundsSetter();
        userDialogs.showSettledFields(userDialogs.getUserName(), userDialogs.getRoundsCount());
        WinConditionCalculator.game(userDialogs.getRoundsCount());
        UserDialogs.newGameAfterGame();
    }
}
