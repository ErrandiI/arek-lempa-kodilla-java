package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {
    private String username;
    private int roundsCount;

    public String nameSetter(){
        System.out.println("Welcome to Rock, Paper, Scissors game!");
        System.out.println("Please enter your name:");
        Scanner userNameScan = new Scanner(System.in);
        username = userNameScan.next();
        return username;
    }

    public String getUserName(){
        return username;
    }

    public int roundsSetter(){
        System.out.println("Please enter how many rounds you would like to play:");
        Scanner roundsScanner = new Scanner(System.in);
        roundsCount = roundsScanner.nextInt();
        return roundsCount;
    }

    public int getRoundsCount(){
        return roundsCount;
    }

    public static void showSettledFields(String username, int rounds){
        System.out.println("Welcome " + username+"!");
        System.out.println("You will play against computer for " + rounds +" rounds.");
        System.out.println("To play use keys:\n 1 - Rock\n 2 - Paper\n 3 - Scissors\n Q - End game\n N - New game");
        System.out.println("Good luck!");
    }

    public static UserSelection getUserSelection(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please enter your move (1 - Rock, 2 - Paper, 3 - Scissors, Q - End game, N - New game");
            String s = sc.nextLine().toUpperCase();
            switch (s){
                case "1":return UserSelection.ROCK;
                case "2":return UserSelection.PAPER;
                case "3":return UserSelection.SCISSORS;
                case "N":return UserSelection.NEW;
                case "Q":return UserSelection.QUIT;
                default:
                    System.out.println("Wrong key, try again");
                    System.out.println("Please enter your move (1 - Rock, 2 - Paper, 3 - Scissors, Q - End game, N - New game");
            }
        }
    }

    public static void newGame(){
        boolean end = false;
        System.out.println("Do you really want to start a new game  Y/N ?");
        while(!end) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    StartGame.startGame();
                case "N":
                    System.out.println("Greate, pick up your move!");
                    end = true ;
                    break;
                default:
                    System.out.println("Wrong data");
            }
        }
    }

    public static void quit(){
        System.out.println("Do you really want to quit? Y/N ?");
        boolean isQuit = true;
        while (isQuit) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    System.exit(0);
                case "N":
                    System.out.println("Greate, pick up your move!");
                    isQuit = false;
                    break;
                default:
                    System.out.println("Wrong data");
            }
        }

    }

    public static void showMoves(UserSelection playerMove, UserSelection compMove, RoundResult roundResult){
        System.out.println("Player move: "+ playerMove + ", computer move: " + compMove + "\nRound Result = " + roundResult);
    }
    public static void showStatistics(int playerWins, int computerWins, int roundCount) {
        System.out.println("Player wins: " + playerWins + " Computer wins: " + computerWins + " Round number: " +roundCount);
    }

    public static void showFinalStatistics(int PlayerWins, int ComputerWins) {
        if (PlayerWins> ComputerWins) {
            System.out.println("Player have won !");
        } else if (ComputerWins > PlayerWins) {
            System.out.println("Computer has won !");
        } else  {
            System.out.println("There was a Tie !");
        }
    }

    public static void newGameAfterGame() {
        boolean end = false;
        System.out.println("Do you want to start a new game  Y/N ? " );
        while(!end) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    StartGame.startGame();
                case "N":
                    System.out.println("See you later ! :)");
                    System.exit(0);
                default:
                    System.out.println("Wrong data");
            }
        }
    }
}
