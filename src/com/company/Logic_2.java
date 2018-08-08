package com.company;
import java.util.*;

public class Logic_2 {

    public static void main(String[] args) {
        System.out.println("Which task will we solve? Input number:");
        System.out.println("1 for MakeBricks");
        System.out.println("2 for loneSum");
        System.out.println("3 for luckySum");
        System.out.println("4 for noTeenSum");
        System.out.println("5 for roundSum");
        System.out.println("6 for closeFar");

        Scanner scan = new Scanner(System.in);
        int taskNumber = scan.nextInt();

        switch (taskNumber) {
            case 1:
                userInputForMakeBricks();
                break;
            case 2:
                System.out.println("Sum =" + loneSum(1, 2,3));
                System.out.println("Sum =" + loneSum(3, 2,3));
                System.out.println("Sum =" + loneSum(3, 3,3));
                System.out.println("Sum =" + loneSum(2, 2,9));
                System.out.println("Sum =" + loneSum(2, 9,2));
                System.out.println("Sum =" + loneSum(2, 9,3));
                System.out.println("Sum =" + loneSum(4, 2,3));
                System.out.println("Sum =" + loneSum(1, 3,1));
                break;
            case 3:
                System.out.println("Sum = " + luckySum(1, 2,3) + " expected sum = 6");
                System.out.println("Sum = " + luckySum(1, 2,13) + " expected sum = 3");
                System.out.println("Sum = " + luckySum(1, 13,3) + " expected sum = 1");
                System.out.println("Sum = " + luckySum(1, 13,13) + " expected sum = 1");
                System.out.println("Sum = " + luckySum(6, 5,2) + " expected sum = 13");
                System.out.println("Sum = " + luckySum(13, 2,3) + " expected sum = 0");
                System.out.println("Sum = " + luckySum(13, 2,13) + " expected sum = 0");
                System.out.println("Sum = " + luckySum(13, 13,2) + " expected sum = 0");
                System.out.println("Sum = " + luckySum(9, 4, 13) + " expected sum = 13");
                System.out.println("Sum = " + luckySum(8, 13,2) + " expected sum = 8");
                System.out.println("Sum = " + luckySum(7, 2,1) + " expected sum = 10");
                System.out.println("Sum = " + luckySum(3, 3,13) + " expected sum = 6");
                break;
            case 4:
                System.out.println("actual" + " expected");
                System.out.printf("%8s%n", noTeenSum(1, 2,3) + " 6");
                System.out.printf("%8s%n", noTeenSum(2, 13,1) + " 3");
                System.out.printf("%8s%n", noTeenSum(2, 1,14) + " 3");
                System.out.printf("%9s%n", noTeenSum(2, 1,15) + " 18");
                System.out.printf("%9s%n", noTeenSum(2, 1,16) + " 19");
                System.out.printf("%8s%n", noTeenSum(2, 1,17) + " 3");
                System.out.printf("%8s%n", noTeenSum(17, 1,2) + " 3");
                System.out.printf("%9s%n", noTeenSum(2, 15,2) + " 19");
                System.out.printf("%9s%n", noTeenSum(16, 17,18) + " 16");
                System.out.printf("%8s%n", noTeenSum(17, 18,19) + " 0");
                System.out.printf("%9s%n", noTeenSum(15, 16,1) + " 32");
                System.out.printf("%9s%n", noTeenSum(15, 15,19) + " 30");
                System.out.printf("%9s%n", noTeenSum(15, 19,16) + " 31");
                System.out.printf("%8s%n", noTeenSum(5, 17,18) + " 5");
                System.out.printf("%9s%n", noTeenSum(17, 18,16) + " 16");
                System.out.printf("%8s%n", noTeenSum(17, 18, 18) + " 0");
                break;
            case 5:
                userInputForRoundSum();
                break;
            case 6:
                System.out.println(closeFar(2, 3,6));
                break;
         }
    }

    // Task1 makeBricks for user input
    public static void userInputForMakeBricks() {
        int small = 0;
        int big = 0;
        int goal = 0;
        System.out.println("Enter amount of small bricks:");
        Scanner scan = new Scanner(System.in);
        small = scan.nextInt();

        System.out.println("Enter amount of big bricks:");
        big = scan.nextInt();
        System.out.println("Enter goal:");
        goal = scan.nextInt();

        scan.close();

        if (makeBricks(small, big, goal)) System.out.println("It's enough");
        else System.out.println("It's not enough");
    }
    // Task2 loneSum decision
    public static boolean makeBricks(int small, int big, int goal) {
        if (goal/5 <= big) {
            return (goal%5 <= small);

        }
        else return (small >= (goal-big*5));
    }

    // Task2 loneSum
    public static int loneSum(int a, int b, int c) {
        if (a == b && b == c) return 0;
        if (a == b) return c;
        if (b == c) return a;
        if (c == a) return b;
        else return a+b+c;
    }
    //Task3 luckySum
    public static int luckySum(int a, int b, int c) {
        if (a == 13) return 0;
        if (b == 13 && a != 13) return a;
        if (c == 13 && a != 13 && b != 13) return a+b;
        else return a+b+c;
    }
    //Task4 noTeenSum
    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if ((13 <= n) && (n <= 19) && (n != 15 && n != 16)) return 0;
        else return n;
    }

    //Task5 roundSum
    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        if(num % 10 >= 5)
            return num + 10 - num % 10;
        return num - num % 10;
    }

    // Task5 roundSum for user input
    public static void userInputForRoundSum() {
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Enter a:");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();

        System.out.println("Enter b:");
        b = scan.nextInt();
        System.out.println("Enter c:");
        c = scan.nextInt();

        scan.close();

        System.out.println(roundSum(a, b, c));
    }

    //Task6 closeFar
    public static boolean closeFar(int a, int b, int c) {
        if ((Math.abs(Math.abs(a) - Math.abs(b)) <= 1) && ((Math.abs(Math.abs(a) - Math.abs(c)) > 1) && (Math.abs(Math.abs(b) - Math.abs(c))) > 1)) return true;
        if ((Math.abs(Math.abs(a) - Math.abs(c)) <= 1) && ((Math.abs(Math.abs(a) - Math.abs(b)) > 1) && (Math.abs(Math.abs(b) - Math.abs(c))) > 1)) return true;
        else return false;
    }

    //Task6 closeFar refactored
    public static boolean closeFarVersion2(int a, int b, int c) {
        if (Math.abs(Math.abs(a) - Math.abs(b)) <= 1) {
            if ((Math.abs(Math.abs(a) - Math.abs(c)) > 1) && (Math.abs(Math.abs(b) - Math.abs(c))) > 1) return true;
        }
        if ((Math.abs(Math.abs(a) - Math.abs(c)) <= 1) && ((Math.abs(Math.abs(a) - Math.abs(b)) > 1) && (Math.abs(Math.abs(b) - Math.abs(c))) > 1)) return true;
        else return false;
    }
}