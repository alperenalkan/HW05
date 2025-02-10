package Exercises;

import java.util.ArrayList;

public class kitapYönetimSistemi {
    private ArrayList<kitapSlave>kitaplar;

    public kitapYönetimSistemi() {
        this.kitaplar = new ArrayList<>();
    }

    public void addKitap(kitapSlave kitapadiekle) {
        kitaplar.add(kitapadiekle);
    }

    public void listKitap() {
      if(kitaplar.isEmpty()){
          System.out.println("kitaplar is empty");
      }else {
          for (kitapSlave boooks : kitaplar) {
              boooks.kitapBilgileri();
              System.out.println("---------------------------------");



          }
      }
    }
}
