import model.Zlomek;
import model.ZlomekFactory;

public class Zlomky {

    public static final int POCET_ZLOMKU = 5;
    public static void main(String[] args) {

        Zlomek [] pole = new Zlomek[POCET_ZLOMKU];

        for (int i = 0; i < pole.length ; i++) {
            pole[i] = ZlomekFactory.vytvorNahodnyZlomek();
            System.out.println(pole[i]);
        }



    }
}
