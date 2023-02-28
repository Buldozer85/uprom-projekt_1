import model.Zlomek;
import model.ZlomekFactory;
import java.util.ArrayList;
import java.util.List;

public class Zlomky {

    public static final int POCET_ZLOMKU = 5;
    
    public static void vypis(List<Zlomek> kolekce) {
        for(var zlomek : kolekce) {
            System.out.println(zlomek);
        }
    }
    
    
    public static void main(String[] args) {

        Zlomek [] pole = new Zlomek[POCET_ZLOMKU];

        for (int i = 0; i < pole.length ; i++) {
            pole[i] = ZlomekFactory.vytvorNahodnyZlomek();
            System.out.println(pole[i]);
        }
        
        Zlomek vysledny = new Zlomek();
        
        for(var zlomek : pole) {
            vysledny.pricti(zlomek);
        }
        
        List<Zlomek> seznamZlomku = new ArrayList<>();
        
        ZlomekServices.naplnKolekciNahodnymiZlomky(seznam, POCET_ZLOMKU);
        
        vypis(seznamZlomku);
        
      
    }
}
