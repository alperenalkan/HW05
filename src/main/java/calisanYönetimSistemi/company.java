package calisanYönetimSistemi;

import java.util.ArrayList;

public class company {

    private ArrayList<calisan>calisanlar;

    public company() {
        calisanlar = new ArrayList<>();
    }

    public void addCalisan(calisan calisan) {
        calisanlar.add(calisan);
    }

    public void listCalisan() {
        if (calisanlar.isEmpty()) {
            System.out.println("Calisanlar is empty");
        }else {
            for (calisan calisan : calisanlar) {
                calisan.calisanBilgileriYazdir();
                System.out.println("-----------------------------------");

            }
        }
    }
    public void theBestSalary(){
        if (calisanlar.isEmpty()){
            System.out.println("Calisanlar is empty");
            return;
        }
        calisan enYüksekMaasli = calisanlar.get(0);
        for (calisan calisan : calisanlar) {
            if (calisan.getSalary() > enYüksekMaasli.getSalary()){
                enYüksekMaasli = calisan;
            }
        }
        System.out.println("en yüksek maasli;");
        enYüksekMaasli.calisanBilgileriYazdir();

    }
}
