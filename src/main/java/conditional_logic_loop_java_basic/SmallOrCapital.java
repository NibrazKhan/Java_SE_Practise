//1. Write a program to check if inputted letter is small or capital
package conditional_logic_loop_java_basic;

import java.util.Scanner;

public class SmallOrCapital {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            //extracting the first character
            char letter = sc.next().charAt(0);
//            alternativeSolve(letter);
            if (Character.isLetter(letter)) {
                //checking whether the ASCII is greater than 65 and less than 90 or not for checking capital letter
                if ((int) letter >= 65 && (int) letter <= 90) {
                    System.out.println("This is a Capital letter");
                } else {
                    System.out.println("This is a small letter");
                }
            } else {
                System.out.println("The input is not a letter! Give valid input");
            }
        }
        //Exception handled for user giving irrelevant input
        catch (Exception e) {
            System.out.println("Give valid letter as an input!");
        }
    }

    public static void alternativeSolve(char letter) {
        if (Character.isLetter(letter)) {
            if (Character.isUpperCase(letter)) {
                System.out.println("This is a Capital letter");
            } else {
                System.out.println("This is a small letter");
            }

        }
    }
}