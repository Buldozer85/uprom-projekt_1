public class Zlomek {

    private long citatel;
    private long jmenovatel;

    /**
     * @return long citatel
     */

    public long getCitatel() {
        return citatel;
    }

    /**
     * @return long jmenovatel
     */
    public long getJmenovatel() {
        return jmenovatel;
    }

    /**
     * @param jmenovatel
     */
    public Zlomek setJmenovatel(long jmenovatel) {
        this.jmenovatel = jmenovatel;
        return this;
    }

    /**
     * @param citatel
     */
    public Zlomek setCitatel(long citatel) {
        this.citatel = citatel;
        return this;
    }

    @Override
    public String toString() {
        return this.citatel + "/" + this.jmenovatel;
    }

    public void vypis() {
        System.out.println(this);
    }

    public static String secti(String[] zlomky) {
        long jmenovatel = 1;
        Long[] citatele = new Long[zlomky.length];
        Long[] jmenovatele = new Long[zlomky.length];
        for (String zlomek :
                zlomky) {
            int i = 0;
            String[] rozdelenyZlomek = zlomek.split("/");
            jmenovatele[i] = Long.parseLong(rozdelenyZlomek[1]);
            jmenovatel *= Long.parseLong(rozdelenyZlomek[1]);
            citatele[i] = Long.parseLong(rozdelenyZlomek[0]);
            i++;
        }

        long citatel = 0;
        for (String zlomek :
                zlomky) {
            int i = 0;

            citatel += (jmenovatel / jmenovatele[i]) * citatele[i];


        }

        return citatel + "/" + jmenovatel;

    }
}
