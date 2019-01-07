package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {

    public static String getUserName(){
        System.out.println("Welcome to Rock, Paper, Scissors game!");
        System.out.println("Please enter your name:");
        Scanner userNameScan = new Scanner(System.in);
        return userNameScan.next();
    }

    public static int getRounds(){
        Scanner roundsScanner = new Scanner(System.in);
        while(true) {
            System.out.println("Please enter how many rounds you would like to play:");
            String s = roundsScanner.nextLine();
            try {
                return Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("Wrong data");
            }
        }
    }

    public static int getVersion() {
        Scanner gameVersionScanner = new Scanner(System.in);
        while(true){
            System.out.println("For standard game please set 0 or you can select expanded version with Spock and Lizard using 1");
            String s = gameVersionScanner.nextLine();
            try {
                switch (s) {
                    case "0":
                        return 0;
                    case "1":
                        return 1;
                    default:
                        System.out.println("Wrong key, try again");
                }
            } catch (Exception e){
                System.out.println("Wrong data");
            }
        }
    }

    public static int getDifficulty() {
        Scanner gameDifficultyScanner = new Scanner(System.in);
        while(true){
            System.out.println("Please select difficulty lvl 0 mean normal, 1 mean that computer will cheat you");
            String s = gameDifficultyScanner.nextLine();
            try {
                switch (s) {
                    case "0":
                        return 0;
                    case "1":
                        return 1;
                    default:
                        System.out.println("Wrong key, try again");
                }
            } catch (Exception e) {
                System.out.println("Wrong data");
            }
        }
    }

    public static void showSettledFields(String username, int rounds){
        System.out.println("Welcome " + username+"!");
        System.out.println("You will play against computer for " + rounds +" rounds.");
        System.out.println("To play use keys:\n 1 - Rock\n 2 - Paper\n 3 - Scissors\n 4 - Lizard (expanded version)\n 5 - Spock (expanded version)\n Q - End game\n N - New game");
        System.out.println("Good luck!");
    }

    public static UserSelection getUserSelection(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please enter your move (1 - Rock, 2 - Paper, 3 - Scissors, Q - End game , N - New game)");
            String s = sc.nextLine().toUpperCase();
            switch (s){
                case "1":return UserSelection.ROCK;
                case "2":return UserSelection.PAPER;
                case "3":return UserSelection.SCISSORS;
                case "N":return UserSelection.NEW;
                case "Q":return UserSelection.QUIT;
                default:
                    System.out.println("Wrong key, try again");
            }
        }
    }

    public static UserSelection getUserSelectionExtended(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please enter your move (1 - Rock, 2 - Paper, 3 - Scissors, 4 - Lizard (expanded version), 5 - Spock (expanded version), Q - End game, N - New game)");
            String s = sc.nextLine().toUpperCase();
            switch (s){
                case "1":return UserSelection.ROCK;
                case "2":return UserSelection.PAPER;
                case "3":return UserSelection.SCISSORS;
                case "4":return UserSelection.LIZARD;
                case "5":return UserSelection.SPOCK;
                case "N":return UserSelection.NEW;
                case "Q":return UserSelection.QUIT;
                default:
                    System.out.println("Wrong key, try again");
            }
        }
    }

    public static boolean newGame(){
        System.out.println("Do you really want to start a new playOneGame  Y/N ?");
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    return true;
                case "N":
                    System.out.println("Greate, pick up your move!");
                    return false;
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

    public static boolean newGameAfterGame() {
        System.out.println("Do you want to start a new playOneGame  Y/N ? " );
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    return true;
                case "N":
                    System.out.println("See you later ! :)");
                    return false;
                default:
                    System.out.println("Wrong data");
            }
        }
    }
}
