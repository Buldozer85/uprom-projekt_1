public class Zlomek {

    private long citatel;
    private long jmenovatel;

    /**
     * @return long citatel
     */

    public Zlomek() {
        this(0L,1L);
    }

    public Zlomek(Long citatel, Long jmenovatel) {
        if(jmenovatel == 0) {
            throw new IllegalArgumentException("Dělení nulou");
        }

        this.jmenovatel = jmenovatel;
        this.citatel = citatel;

    }

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
        if(jmenovatel == 0) {
            throw new IllegalArgumentException("Dělení nulou");
        }
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

    public Zlomek soucet(Zlomek z1) {
        Long jmenovatel = this.jmenovatel * z1.jmenovatel;
        Long citatel = (jmenovatel / this.jmenovatel) * this.citatel + (jmenovatel / z1.jmenovatel) * z1.citatel;
        return new Zlomek(citatel, jmenovatel);
    }

    public void pricti(Zlomek z1) {
        Long jmenovatel = this.jmenovatel * z1.jmenovatel;
        this.setCitatel((jmenovatel / this.jmenovatel) * this.citatel + (jmenovatel / z1.jmenovatel) * z1.citatel)
                .setJmenovatel(jmenovatel);
    }

    public void vynasob(Zlomek z2)
    {
       /* this.setJmenovatel(this.jmenovatel * z2.jmenovatel)
                .setCitatel(this.citatel * z2.citatel);*/
        this.jmenovatel = this.jmenovatel * z2.jmenovatel;
        this.citatel = this.citatel * z2.citatel;
    }

    public void zkratit () {
        long nsd = nejvetsiSpolecnyDelitel(this.citatel, this.jmenovatel);

        this.citatel /= nsd;
        this.jmenovatel /= nsd;
    }

    private long nejvetsiSpolecnyDelitel(long a, long b)
    {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            long zbytek = a % b;
            a = b;
            b = zbytek;
        }

        return a;
    }

    /*public static String secti(String[] zlomky) {
        long jmenovatel = 1;
        Long[] citatele = new Long[zlomky.length];
        Long[] jmenovatele = new Long[zlomky.length];
        for (String zlomek : zlomky) {
            int i = 0;
            String[] rozdelenyZlomek = zlomek.split("/");
            jmenovatele[i] = Long.parseLong(rozdelenyZlomek[1]);
            jmenovatel *= Long.parseLong(rozdelenyZlomek[1]);
            citatele[i] = Long.parseLong(rozdelenyZlomek[0]);
            i++;
        }

        long citatel = 0;
        for (String zlomek : zlomky) {
            int i = 0;
            citatel += (jmenovatel / jmenovatele[i]) * citatele[i];
        }
        return citatel + "/" + jmenovatel;
    }*/
}
