package Exercises;

public class Exercise03 {
    public static void main(String[] args) {
        /*
        Senaryo 4: Dizi İçindeki En Uzun Kelimeyi Bulma
         Bir dizi içerisindeki en uzun kelimeyi bulun. Aynı uzunluktaki kelimeler varsa ilk bulduğunuzu döndürün.

        Açıklama:

         Giriş: ["apple", "banana", "grape", "kiwi"]
         Çıktı: "banana"
         */

        String[] kelimelers = {"apple", "banana", "grape", "kiwi"};
        String kelimelers2 = "";
        for(String kelimeler : kelimelers){
            if(kelimeler.length()>kelimelers2.length()){
                kelimelers2 = kelimeler;
            }

        }
        System.out.println(kelimelers2);
    }
}
