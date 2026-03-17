import java.util.Scanner;

public class primoEsercizio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Addizione
        System.out.print("Inserisci il primo numero (addizione): ");
        int num1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero (addizione): ");
        int num2 = scanner.nextInt();
        int addizione = num1 + num2;
        System.out.println("Il totale (addizione) è: " + addizione);

        // Sottrazione
        System.out.print("Inserisci il primo numero (sottrazione): ");
        num1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero (sottrazione): ");
        num2 = scanner.nextInt();
        int sottrazione = num1 - num2;
        System.out.println("Il totale (sottrazione) è: " + sottrazione);

        // Moltiplicazione
        System.out.print("Inserisci il primo numero (moltiplicazione): ");
        num1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero (moltiplicazione): ");
        num2 = scanner.nextInt();
        int moltiplicazione = num1 * num2;
        System.out.println("Il totale (moltiplicazione) è: " + moltiplicazione);

        // Divisione
        System.out.print("Inserisci il primo numero (divisione): ");
        num1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero (divisione): ");
        num2 = scanner.nextInt();
        double divisione = (double) num1 / num2;
        System.out.println("Il totale (divisione) è: " + divisione);

        scanner.close();
    }
}