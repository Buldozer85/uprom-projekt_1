package model;

import java.util.Random;

public class ZlomekFactory {
    public static Zlomek vytvorNahodnyZlomek() {
        Random random = new Random();

        long jmenovatel = random.nextLong();

        while (jmenovatel == 0) {
            jmenovatel = random.nextLong();
        }

        return new Zlomek(random.nextLong(), jmenovatel);
    }
}
