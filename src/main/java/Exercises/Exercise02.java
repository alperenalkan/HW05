package Exercises;

public class Exercise02 {
    /*
    Bir dizi içerisindeki string elemanlarını birleştirip, her kelimenin baş harflerini büyük yaparak yeni bir kelime oluşturun.

Açıklama:

Giriş: ["hello", "world", "this", "is", "java"]
Çıktı: "HelloWorldThisIsJava"
    */

    public static void main(String[] args) {
        String[] words = {"hello", "world", "this", "is", "java"};
        for (String word : words) {
            String word_1 = word.replaceAll("[^a-zA-Z]", "");
            String word_2 = word_1.substring(0,1).toUpperCase()+word_1.substring(1);
            System.out.print(word_2);
        }


    }
}
