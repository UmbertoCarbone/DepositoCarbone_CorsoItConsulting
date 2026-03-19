package Java19_03.Java19_03_mattina;

import java.util.ArrayList;
import java.util.Scanner;

public class ES02_menu {
    public static void main(String[] args) {

        // ArrayList per memorizzzare i nomi dentro la lista
        ArrayList<String> listName = new ArrayList<>();
        // Scanner per input
        Scanner scannerStr = new Scanner(System.in);

        int scelta = 0;

        while (scelta != 5) {
            System.out.println("1 - Aggiungi nome");
            System.out.println("2 - Visualizza tutti i nomi");
            System.out.println("3 - Cerca nome");
            System.out.println("4 - Rimuovi nome");
            System.out.println("5 - Esci");
            System.out.print("Scegli un'opzione: ");

            switch (scelta) {
                case 1:
                    // caso
                    break;
                case 2:
                    // caso
                    break;
                case 3:
                    // caso
                    break;
                case 4:
                    // caso
                    break;
                case 5:
                    // caso
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        }
    }

}
