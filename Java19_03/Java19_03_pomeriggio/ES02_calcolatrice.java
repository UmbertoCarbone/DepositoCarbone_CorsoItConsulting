package Java19_03.Java19_03_pomeriggio;

import java.util.Scanner;

public class ES02_calcolatrice {
    static int somma(int a, int b) {
        return a + b;
    }

    static int sottrazione(int a, int b) {
        return a - b;
    }

    static int moltiplicazione(int a, int b) {
        return a * b;
    }

    static double divisione(int a, int b) {
        return a / b;
    }

    static int potenza(int base, int esponente) {
        return (int) Math.pow(base, esponente);
    }

    static void logA() {
        System.out.println("Inserisci il primo numero");
    }

    static void logB() {
        System.out.println("Inserisci il secondo numero");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int scelta = 0;
        int numA;
        int numB;

        while (scelta != 5) {
            System.err.println(" --CALCOLATRICE-- ");
            System.err.println(" 1) ADDIZIONE ");
            System.err.println(" 2) SOTTRAZIONE ");
            System.err.println(" 3) MOLTIPLICAZIONE ");
            System.err.println(" 4) DIVISIONE ");
            System.out.println("5) POTENZA ");
            System.err.println(" 6) ESCI ");
            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 6:
                    logA();
                    numA = scanner.nextInt();
                    logB();
                    numB = scanner.nextInt();
                    System.out.println("Totale : " + somma(numA, numB));
                    break;
                case 2:
                    logA();
                    numA = scanner.nextInt();
                    logB();
                    numB = scanner.nextInt();
                    System.out.println("Totale : " + sottrazione(numA, numB));
                    break;
                case 3:
                    logA();
                    numA = scanner.nextInt();
                    logB();
                    numB = scanner.nextInt();
                    System.out.println("Totale : " + moltiplicazione(numA, numB));
                    break;
                case 4:
                    logA();
                    numA = scanner.nextInt();
                    logB();
                    numB = scanner.nextInt();
                    if (numB == 0) {
                        System.out.println("Errore divisione per zero");
                    } else {
                        System.out.println("Totale : " + divisione(numA, numB));
                    }
                    break;
                case 5:
                    logA();
                    numA = scanner.nextInt();
                    logB();
                    numB = scanner.nextInt();
                    System.out.println("Totale : " + potenza(numA, numB));
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }
        }
    }
}
