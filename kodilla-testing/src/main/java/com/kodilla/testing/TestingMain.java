package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();


        int result2 = calculator.add(3,15);
        if (result2 == 18)  {
            System.out.println("test2 OK!");
        } else {
            System.out.println("Error2");
        }

        int result3 = calculator.substract(15,3);
        if (result3 == 12)  {
            System.out.println("test3 OK!");
        } else {
            System.out.println("Error3");
        }

    }
}