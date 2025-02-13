package Exercises;

public class HW07 {
    public static void main(String[] args) {
        String sentence = "I like to study Java. Learn Java, earn money. Java is OOP language. Java is easy!";
        int lastJava = sentence.lastIndexOf("Java");
        System.out.println("lastJava = " + lastJava);

        String[] snt = sentence.substring(68, sentence.length()).split(" ");
        System.out.println("snt = " + snt[0]);

       String[] sentence_1 = sentence.split(" ");
       int count = 0;

       for (int i = 0; i < sentence_1.length; i++) {
           String word = sentence_1[i].replaceAll("[^a-zA-Z]","");
           if(word.equals("Java")){
               count ++;
           }
       }
        System.out.println("count = " + count);


    }
}
