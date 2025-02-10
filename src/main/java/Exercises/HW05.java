package Exercises;

import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine().toLowerCase().trim();
        System.out.println("Enter second name: ");
        String secondName = sc.nextLine().toLowerCase().trim();
        System.out.println("Enter third name: ");
        String thirdName = sc.nextLine().toLowerCase().trim();

        firstName = firstName.replaceAll("[\\s+]","");
        secondName = secondName.replaceAll("[\\s+]","");
        thirdName = thirdName.replaceAll("[\\s+]","");

        System.out.println("the lenght of three names: "+ (secondName.length() + firstName.length() + thirdName.length()));

    }
}
