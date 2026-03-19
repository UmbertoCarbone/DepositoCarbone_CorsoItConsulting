package postPomeriggio;

import java.util.Scanner;

/* Somma di numeri (while e do-while)   -  Descrizione:

Scrivi un programma che chiede all'utente di inserire numeri interi positivi.

Il ciclo termina quando l'utente inserisce un numero negativo.

Al termine, il programma stampa la somma di tutti i numeri inseriti (escludendo il numero negativo). */
public class ES01_DoWhile {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);

        int somma = 0;
        int numero;

        do {
            System.out.println("Inserisci un numero intero positivo (numero negativo per terminare): ");
            numero = scannerInt.nextInt();

            if (numero > 1) {
                somma += numero;
            }
        } while (numero >= 0);

        System.out.println("Somma totale: " + somma);
    }
}