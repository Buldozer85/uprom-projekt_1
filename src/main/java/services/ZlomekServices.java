package services;

import java.util.List;
import model.ZlomekFactory;

public class ZlomekServices {

   public static void naplnKolekciNahodnymiZlomky(List<Zlomek> seznam, int pocet) {
     
     for(int i = 0; i < pocet; i++) {
        seznam.add(ZlomekFactory.vytvorNahodnyZlomek());
     } 
   }
   
   public static void zkratitZlomkyVKolekci(List<Zlomek> seznam) {
      
      for(var zlomek : seznam) {
        zlomek.zkratit();
      }
   }
   
   public static void sectiZlomkyVKolekci(List<Zlomek> seznam) {
      
      Zlomek soucet = new Zlomek();
      
      for(var zlomek : seznam) {
         soucet.pricti(zlomek);
      }
      
   }
}
