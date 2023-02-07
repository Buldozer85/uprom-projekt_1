public class Hlavni {
    public static void main (String[] args) {

        long c1 = 1;
        long j1 = 2;

        long c2 = 3;
        long j2 = 4;


        long j3 =  j1 * j2;
        long c3 = c1 * c2;

        vypis(c3, j3);

      /*  if(j2 % j1 == 0 || j1 % j2 == 0) {

        }*/

        long j4 = j1 * j2;
        long c4 = (j4 / j1) * c1 + (j4 / j2) * c2;



        vypis(c4, j4);

        Zlomek zlomek = new Zlomek().setCitatel(10).setJmenovatel(7);

        zlomek.vypis();

        String [] poleZlomku = {"1/2", "1/2"};



        System.out.println(Zlomek.secti(poleZlomku));



    }

    private static void vypis(long c, long j)
    {
        System.out.println(c + "/" + j );
    }
}
