
public class EsempioMath {
    public static void main(String[] args) {
        // Log 1: massimo tra 5 e 10
        int a = 5;
        int b = 10;
        System.out.println("Il massimo tra 5 e 10 è: " + Math.max(a, b));

        // Log 2: minimo tra 5 e 10
        System.out.println("Il minimo tra 5 e 10 è: " + Math.min(a, b));

        // Log 3: radice quadrata di 64
        System.out.println("La radice quadrata di 64 è: " + Math.sqrt(64));

        double numero = -15.3;
        System.out.println("Il valore assoluto di " + numero + " è: " + Math.abs(numero));

        int casuale = (int) (Math.random() * 50) + 1;
        System.out.println("Numero casuale tra 0 e 50: " + casuale);
    }
}