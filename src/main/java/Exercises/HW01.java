package Exercises;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        /*  Task 3: Vowel or Consonant Checker
        Write a program that takes a single character as input and determines whether it is:
        A Vowel (A, E, I, O, U in both uppercase and lowercase).
        A Consonant (any other alphabet letter).
        Not a Letter (if it is a digit or a special character).
        Use nested ternary operators to implement this logic.  */
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("Enter a single character: ");
            String character = sc.nextLine();


            //A VOWEL TRUE or FALSE
            String vowel = character.replaceAll("[^aeioöuüAEIOÖUÜ]", "");
            boolean voweltrueorfalse = vowel.length() > 0;
            //System.out.println("the character is a vovel; "+voweltrueorfalse);

            // is a charachter
            boolean charactertrueorfalse = character.length() == 1;
            //System.out.println("the character is one letter character; "+ charactertrueorfalse);

            // is a consonent
            String consenent = character.replaceAll("[aeioöuüAEIOÖUÜ]", "");
            boolean consenttrueorfalse = consenent.length() > 0;
            //System.out.println("the character can be a consonent; "+consenttrueorfalse);

            // is a letter or special character
            String isacharacter = character.replaceAll("[a-zA-Z]", "");
            boolean isacharactertrueorfalse = isacharacter.length() > 0;
            //System.out.println("the character is a special character; "+isacharactertrueorfalse);

            // is a digit
            String isadigit = character.replaceAll("[^0-9]", "");
            boolean isadigittrueorfalse = isadigit.length() > 0;
            //System.out.println("the character is a digit; "+isadigittrueorfalse);


            if (charactertrueorfalse) {
                // System.out.println("character is a character " + character);
                if (voweltrueorfalse) {
                    System.out.println("the character is a vovel " + character);
                } else if (!voweltrueorfalse && !isadigittrueorfalse && !isacharactertrueorfalse) {
                    System.out.println("the character is a consonent; " + character);
                } else if (isadigittrueorfalse) {
                    System.out.println("the character is a digit; " + character);
                } else if (isacharactertrueorfalse && !isadigittrueorfalse) {
                    System.out.println("the character is a special character; " + character);
                } else {
                    System.out.println("please enter a valid value!!");
                }
            } else {
                System.out.println("please eneter a one letter character");

            }


        }
    }
}
