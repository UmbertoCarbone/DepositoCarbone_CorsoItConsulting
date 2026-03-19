package Java19_03.Java19_03_pomeriggio;

import java.util.ArrayList;
import java.util.Scanner;

public class ES_04_voto {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        ArrayList<Integer> voti = new ArrayList<>();

        // Inserimento numero voti
        System.out.print("Quanti voti vuoi inserire? ");
        int numeroVoti = scannerInt.nextInt();

        for (int i = 0; i < numeroVoti; i++) {
            System.out.println("Inserisci voto" + (i + 1));
            int voto = scannerInt.nextInt();
            voti.add(voto);
        }

        int scelta = 0;
        while (scelta != 5) {

            System.out.println(" --- MENU ---");
            System.out.println("1 - Calcola media");
            System.out.println("2 - Voto più alto");
            System.out.println("3 - Voto più basso");
            System.out.println("4 - Verifica promozione");
            System.out.println("5 - Esci");

            scelta = scannerInt.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("La media è: " + calcolaMedia(voti));
                    break;
                case 2:
                    System.out.println("Voto più alto: " + votoMax(voti));
                    break;
                case 3:
                    System.out.println("Voto più alto: " + votoMin(voti));
                    break;
                case 4:
                    System.out.println(isPromosso(voti));
                    break;
                case 5:
                    System.out.println("ciao");
                    break;
                default:
                    System.out.println("scelta non valida");

            }

        }

    }

    // funzione media
    public static double calcolaMedia(ArrayList<Integer> voti) {
        int somma = 0;
        for (int i = 0; i < voti.size(); i++) {
            somma += voti.get(i);
        }
        if (voti.size() == 0)
            return 0;
        return (double) somma / voti.size();
    }

    public static int votoMax(ArrayList<Integer> voti) {
        int max = voti.get(0);
        for (int i = 0; i < voti.size(); i++) {
            if (voti.get(i) > max) {
                max = voti.get(i);
            }

        }
        return max;
    }

    public static int votoMin(ArrayList<Integer> voti) {
        int min = voti.get(0);
        for (int i = 0; i < voti.size(); i++) {
            if (voti.get(i) < min) {
                min = voti.get(i);
            }

        }
        return min;
    }

    public static String isPromosso(ArrayList<Integer> voti) {
        double media = calcolaMedia(voti);
        if (media >= 6) {
            return "promosso";
        } else {
            return "bocciato";
        }
    }
}
