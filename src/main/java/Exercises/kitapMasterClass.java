package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class kitapMasterClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        kitapYönetimSistemi sistem1 = new kitapYönetimSistemi();

        while (true) {
            System.out.println("-----Kitap yönetim sistemi-----");
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitaplari Listele");
            System.out.println("3. Cikis");
            System.out.println("Seciminizi giriniz");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Kitap adi: ");
                    String kitapadi = scanner.nextLine();
                    System.out.println("Yazar di: ");
                    String yazaradi = scanner.nextLine();
                    System.out.println("Sayfa sayisi: ");
                    int sayfasayisi = scanner.nextInt();
                    scanner.nextLine();

                    kitapSlave yenikitap = new kitapSlave(kitapadi, yazaradi, sayfasayisi);
                    sistem1.addKitap(yenikitap);
                    System.out.println("Kitap eklendi.");
                    break;

                case 2:
                    sistem1.listKitap();
                    System.out.println("Kitap listendi.");
                    break;
                case 3:
                    System.out.println("Cikildi");
                    break;
                default:
                    System.out.println("Gecersiz giris bir daha deneyin.");
                    break;

            }
            if(choice == 3) {
                break;
            }
        }
    }
}
