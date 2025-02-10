package Exercises;

import java.util.Scanner;

public class HW06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an gmail: ");
        String gmail = sc.nextLine();

        if (gmail.contains("@gmail.com") && gmail.endsWith("@gmail.com")) {
            gmail = gmail.replaceAll("@gmail.com", "");
            String upperCase = gmail.replaceAll("^[A-Z]","");
            String lowerCase = gmail.replaceAll("[^a-z]","");
            String number = gmail.replaceAll("[^0-9]","");
            String character = gmail.replaceAll("[^a-zA-Z0-9]","");
            if (gmail.length()>5 && !upperCase.isEmpty() && !lowerCase.isEmpty() && !number.isEmpty() && !character.isEmpty()) {
                System.out.println("your gmail is okay and you logged!!");
            }else {
                System.out.println("your gmail is not valid!!");
            }
        } else if (!gmail.contains("@gmail.com") && !gmail.endsWith("@gmail.com")) {
            System.out.println("You have unsuccessfully logged in please try again!");
        }
    }
}
