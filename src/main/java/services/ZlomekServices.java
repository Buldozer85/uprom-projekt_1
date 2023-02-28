package services;

import java.util.List;
import model.ZlomekFactory;

public class ZlomekServices {

   public static void naplnKolekciNahodnymiZlomky(List<Zlomek> seznam, int pocet) {
     
     for(int i = 0; i < pocet; i++) {
        seznam.add(ZlomekFactory.vytvorNahodnyZlomek());
     }
     
   }
}
