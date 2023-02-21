package services;

public class numericServices {

    public static long nejvetsiSpolecnyDelitel(long a, long b)
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
}
