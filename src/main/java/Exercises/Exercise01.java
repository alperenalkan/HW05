package Exercises;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[4];

        System.out.println("lütfen birici elemani giriniz: ");
        words[0] = sc.nextLine();
        System.out.println("lütfen ikinci elemani giriniz: ");
        words[1] = sc.nextLine();
        System.out.println("lütfen ücüncü elemani giriniz: ");
        words[2] = sc.nextLine();
        System.out.println("lütfen dördüncü elemani giriniz: ");
        words[3] = sc.nextLine();

        for( String word : words ) {
            String word2 = new StringBuffer(word).reverse().toString();
            if (word.equals(word2)) {
                System.out.print(word2 +"/");
            }
        }


    }
}
