package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! What is your name?\n\n");
        String name = sc.nextLine();
        System.out.println(name + "\n\n" + "Well," + name + ",I am thinking of a number between 1 and 20.\n"
                + "Take a guess.\n\n");
        int firstnum = sc.nextInt();
        int a = firstnum;
        if (a >= 10) {
            System.out.println(firstnum + "\n\n"
                    + "Your guess is too high.\n" + "Take a guess.\n\n");
        } else {
            System.out.println(firstnum+ "\n\nWay off" + "\nTry again friend*<"
                    + "\nEnter Number\n");
        }

        int secondnum = sc.nextInt();
        int b = secondnum;
        if (b <= 5) {
            System.out.println(+secondnum + "\n\nYour guess is too low.\n" +"Take a guess.\n");
        } else {
            System.out.println(secondnum+ "\n\nWay Way off" + "\nTry again friend*<"+ "Enter Number\n\n");
        }
        int thirdnum = sc.nextInt();
        String firstname = sc.nextLine();
        int c = thirdnum;
        if (c == 4) {
            System.out.println(thirdnum + "\nGood job," + name + "! You guessed my number in 3 guesses!\n"
                    + "Would you like to play again?(y or n?)\n");
        }
        else {
            System.out.println(thirdnum + "\nYou made the baby cry" + "\nWant to try again*<\n(y or n?)\n");
        }

        // int d= 100;
        //int f = 500;
      //  if (d < f) {
        String end2 = "n";
       // String end = sc.nextLine();
       //     System.out.println(end + end2);
        //}
        String choice1 = sc.nextLine();
        if ((choice1) == choice1.valueOf("y")) {
            System.out.println(choice1+ "error");
        }
        else {
            System.out.println(choice1);
        }

    }}





