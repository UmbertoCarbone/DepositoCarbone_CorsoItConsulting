package Java19_03.Java19_03_pomeriggio;

import java.util.ArrayList;

public class ES03_esercizi {
    public static int somma(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a + b;
    }

    public static double multiply(double a, double b, double c) {
        return a + b + c;
    }

    public static int sommaNaturali(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sommaNaturali(n - 1);
    }

    public static void modificaValore(int x) {
        x = 50;
        System.err.println(x);
    }

    public static void modificaArray(int[] arr) {
        arr[0] = 99;
        System.out.println("Dentro la funzione: " + arr[0]);
    }

    public static void main(String[] args) {
        // funzione di somma invocate
        System.out.println(somma(5, 10));
        System.out.println(somma(3, 4));
        System.out.println("-----------------");
        // funzione di multiply invocate
        System.out.println(multiply(5, 6));
        System.out.println(multiply(2.2, 3.5, 3.6));
        System.out.println("-----------------");
        //

        System.out.println(sommaNaturali(5));
        System.out.println("-----------------");
        // variabile cambia solo quando e' invocata dalla funzione!
        int x = 5;
        System.out.println("Prima: " + x); // 5
        modificaValore(x); // 50
        System.out.println("Dopo: " + x);// 5

        System.out.println("-----------------");

        // array[0] solo dopo l'invocazione cambia
        int[] array = { 1, 2, 3 }; //
        System.out.println("Prima: " + array[0]); // 1
        modificaArray(array); // 99
        System.out.println("Dopo: " + array[0]); // 99
    }
}
