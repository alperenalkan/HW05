package Exercises;

import java.util.Scanner;

public class HW04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a sentence: ");
        String cümle = sc.nextLine();
        System.out.println(isEmpthynm(cümle));
        if (isEmpthynm(cümle)!="empthynm"){
        splittedsentence(cümle);
        System.out.println("cümledeki kelime sayisi: "+countWords(cümle));}


    }
    public static void splittedsentence(String sentence) {
        String[] words = sentence.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            System.out.println((i + 1) + ".ci kelime " + words[i]);

        }

    }
    public static int countWords(String sentence) {
        int count = 0;
        count = sentence.split("\\s+").length;
        return count;
    }
    public static String isEmpthynm(String sentence) {
        boolean result = sentence.isEmpty();
        return result ? "empthynm" : "non empthynm";
    }

    }

