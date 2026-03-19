package postPomeriggio;

import java.util.Scanner;

/* Tabellina di un numero (while)  -  Descrizione:

Scrivi un programma che chiede all'utente
 di inserire un numero intero
 e poi stampa la sua tabellina (da 1 a 10) utilizzando un ciclo while. */
public class ES02_While {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Inserisci un numero intero: ");

        int numero = scannerInt.nextInt();
        scannerInt.nextLine();
        System.out.println("----------");
        int i = 1; // il contatore parte da 1
        while (i <= 10) {
            
            System.out.println( (numero * i));
            i++; // incrementa il contatore
        }

    }
}
