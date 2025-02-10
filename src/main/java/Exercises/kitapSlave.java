package Exercises;

import java.security.Key;

public class kitapSlave {

    private String ad;
    private String yazar;
    private int sayfaSayisi;

    public kitapSlave(String ad1, String yazar1, int sayfaSayisi1){
        this.ad = ad1;
        this.yazar = yazar1;
        this.sayfaSayisi = sayfaSayisi1;
    }


    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }


    public void kitapBilgileri() {
        System.out.println("ad = " + ad);
        System.out.println("yazar = " + yazar);
        System.out.println("sayfaSayisi = " + sayfaSayisi);
    }
}
