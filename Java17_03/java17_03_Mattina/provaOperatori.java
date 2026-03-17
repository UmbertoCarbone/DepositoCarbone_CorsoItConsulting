public class provaOperatori {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 5;
        int w = 7;

        int addizione = x + y;
        int sottrazione = y - z;
        int moltiplicazione = x * y;
        int divisione = y / x;
        int modulo = y % x;

        int numero = 10;
        System.out.println(numero++);
        System.out.println(++numero);
        // operatore di confronto

        System.out.println(x > y);
        System.out.println(y < x);
        System.out.println(x >= 10 && y < y);
        System.out.println(x >= 10 || y < y);
        System.out.println(!(x >= 8));

    }
}
