package Exercises;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = sc.nextLine();
        if (isPalindrome(letter)) {
            System.out.println("the letter is a palindrome");
        }
        else {
            System.out.println("the letter is not a palindrome");
        }


        }

    public static boolean isPalindrome (String str){
        str = str.replaceAll("[\\s]", "");
        str = str.toLowerCase();

        String reversed = "";
        reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);}

}
