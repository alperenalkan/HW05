package calisanYönetimSistemi;

import java.util.Scanner;

public class master {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        company company = new company();

        while(true) {
            System.out.println("------calisan yönetim sistemi-------");
            System.out.println("1. calisan ekle");
            System.out.println("2. calisanlari listele");
            System.out.println("3. en yüksek maasli göster");
            System.out.println("4. cikis");
            System.out.println("seciminizi yapiniz");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("calisan adi");
                   String calisanad = sc.nextLine();
                    System.out.println("calisan soyadi");
                    String soyadi = sc.next();
                    System.out.println("calisan maasi");
                    int calisanmaasi = sc.nextInt();
                    sc.nextLine();
                    System.out.println("pozisyonu");
                    String pozisyonu = sc.nextLine();

                    calisan calisan = new calisan(calisanad, soyadi, calisanmaasi, pozisyonu);
                    company.addCalisan(calisan);
                    break;
                case 2:
                    company.listCalisan();
                    break;
                case 3:
                    company.theBestSalary();
                    break;
                case 4:
                    System.out.println("cikiliyor");
                    break;
                default:
                    System.out.println("lütfen gecerli bir sayi giriniz");
                    break;



            }
            if(choice == 4) {
                break;
            }
        }

    }
}
