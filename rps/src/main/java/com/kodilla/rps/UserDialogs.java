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

    public static void newGame(){

    }

    public static void quit(){

    }

    public static void showStatistic(){

    }


}
