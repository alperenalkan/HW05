package Exercises;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Enter the product price: ");
        double price = scanner.nextDouble();

        // price %20 discount amount>500
        if (amount<=0 || price<=0){
            System.out.println("Please enter a positive number!");
        }
        else if(amount<200){
            price = price;
            System.out.println("there is not a discount = " + price+"$");
            System.out.println("the total payment is =" + amount * price+"$");
        }else if(amount<500){
            price = price - price*0.1;
            System.out.println("the new price with discount for a product = " + price+"$");
            System.out.println("the total payment is =" + amount * price+"$");
        } else if (amount>500) {
            price = price - price*0.2;
            System.out.println("the new price with discount = " + price+"$");
            System.out.println("the total payment is =" + amount * price+"$");
        }else {
            System.out.println("please enter a positive number!");
        }


    }
}
