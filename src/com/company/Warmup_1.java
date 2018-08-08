package com.company;

import java.util.*;

public class Warmup_1 {

    public static void main(String[] args) {
        System.out.println("Which task will we solve? Input number:");
        System.out.println("1 for sleepIn");
        System.out.println("2 for monkeyTrouble");
        System.out.println("3 for sumDouble");
        System.out.println("4 for diff21");
        System.out.println("5 for parrotTrouble");
        System.out.println("6 for makes10");

        Scanner scan = new Scanner(System.in);
        int taskNumber = scan.nextInt();

        switch (taskNumber) {
            case 1:
                userInputForInSleep();
                break;
            case 2:
                areWeInTrouble(monkeyTrouble(true, true));
                areWeInTrouble(monkeyTrouble(true, false));
                areWeInTrouble(monkeyTrouble(false, true));
                areWeInTrouble(monkeyTrouble(false, false));
                break;
            case 3:
                userInputForSumDouble();
                break;
            case 4:
                userInputForDiff21();
                break;
            case 5:
                areWeInTrouble(parrotTrouble(true, 6));
                areWeInTrouble(parrotTrouble(true, 7));
                areWeInTrouble(parrotTrouble(false, 6));
                areWeInTrouble(parrotTrouble(true, 21));
                areWeInTrouble(parrotTrouble(false, 21));
                areWeInTrouble(parrotTrouble(false, 20));
                areWeInTrouble(parrotTrouble(true, 23));
                areWeInTrouble(parrotTrouble(false, 23));
                areWeInTrouble(parrotTrouble(true, 20));
                areWeInTrouble(parrotTrouble(false, 12));
                break;
            case 6:
                userInputForMakes10();
                break;
        }
    }

    //Task1 sleepIn
    public static void userInputForInSleep() {
        boolean w = false;
        boolean v = false;
        System.out.println("Is it a weekday?");
        Scanner scan = new Scanner(System.in);
        String weekday = scan.nextLine();
        if (weekday.equals("yes")) {
            w = true;
        }

        System.out.println("Is it a vacation?");
        String vacation = scan.nextLine();
        if (vacation.equals("yes")) {
            w = true;
        }
        scan.close();
        if (sleepIn(w, v) == true) System.out.println("We are sleepIn");
        else System.out.println("We aren't sleepIn");
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else return false;
    }

    // Task2 monkeyTrouble
    public static void areWeInTrouble(boolean inTrouble) {
        if (inTrouble)
            System.out.println("We are in trouble");
        else
            System.out.println("We aren't in trouble");
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        } else return false;
    }

    // Task3 sumDouble
    public static void userInputForSumDouble() {
        int number1 = 0;
        int number2 = 0;
        System.out.println("Enter first number:");
        Scanner scan = new Scanner(System.in);
        number1 = scan.nextInt();

        System.out.println("Enter second number:");
        number2 = scan.nextInt();
        scan.close();
        System.out.print(sumDouble(number1, number2));
    }

    public static int sumDouble(int a, int b) {
        if (a == b) return 2 * (a + b);
        else return a + b;
    }

    // Task4 diff21
    public static void userInputForDiff21() {
        int number1 = 0;
        System.out.println("Enter number:");
        Scanner scan = new Scanner(System.in);
        number1 = scan.nextInt();
        System.out.print("The absolute difference between n and 21:" + " " + diff21(number1));
    }

    public static int diff21(int n) {
        int result;
        if (n <= 21){
            result = 21-n;
            return (Math.abs(result));
        }
        else {
            result = 2*(21-n);
            return (Math.abs(result));
        }
    }

    // Task5 parrotTrouble (areWeInTrouble from Task 2 is used)
    public static boolean parrotTrouble(boolean talking, int hour) {
        boolean parrotTrouble;
        if ((hour<7 || hour >20) && (talking)) {
            return true;
        }
        else {
            return false;
        }
    }
    // Task6 makes10
    public static void userInputForMakes10() {
        int a = 0;
        int b = 0;
        System.out.println("Enter first number:");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();

        System.out.println("Enter second number:");
        b = scan.nextInt();
        scan.close();

        int sum = a + b;
        if (a == 10 || b == 10 || sum == 10){
            System.out.println("It is makes 10");
        }
        else {
            System.out.println("It isn't makes 10");
        }
    }
}