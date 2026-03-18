package es_02;

import java.util.Scanner;

public class Bancomat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // saldo sulla carta
        int saldoIniziale = 1000;

        // scelta per il menu'
        int sceltaNumero;
        
        // menu'
        do {
            System.out.println("1) Visualizza saldo");
            System.out.println("2) Preleva");
            System.out.println("3) Deposita");
            System.out.println("4) Esci");
            System.out.print("Scegli un'opzione: ");

            // input in per scelta numero
            sceltaNumero = scanner.nextInt();

            System.out.println("-------------- ");
            // scelta per il bancomat
            switch (sceltaNumero) {
                // saldo attuale
                case 1:
                    System.out.println("Saldo iniziale: " + saldoIniziale);
                    break;
                // prelievo \\ controlla se il prelievo e' maggiore di 1 euro & prelievo e' piu'
                // basso rispetto al saldo sul conto(saldoIniziale)
                // else per gestire casi di prelievo 0 oppure prelievo piu alto del conto
                // attuale
                case 2:
                    System.out.print("Quanto vuoi prelevare? ");
                    int prelievo = scanner.nextInt();
                    if (prelievo > 1 && prelievo <= saldoIniziale) {

                        saldoIniziale -= prelievo;
                        System.out.println("Saldo Aggiornato! " + saldoIniziale);
                        System.out.println("--------------------");
                        break;
                    } else {
                        System.out.println("Importo non valido o saldo insufficiente.");
                        break; // Prelievo non valido, torna al menu
                    }
                    // deposito soldi
                case 3:
                    System.out.print("Quanto vuoi depositare? ");
                    int deposito = scanner.nextInt();
                    // deposito maggiore di 0
                    if (deposito > 0) {
                        saldoIniziale += deposito;
                        System.out.println("Saldo Aggiornato! " + saldoIniziale);
                        System.out.println("--------------------");
                        break;
                    }
                    // usscire dal menu bancomat + saldoFinale
                case 4:
                    System.out.println("Uscito dal ciclo! il tuo saldo totale e\' " + saldoIniziale);
                    // scelta numero non valido
                default:
                    System.out.println("Scelta non valida.");
            }
        } while (sceltaNumero != 4); // cicla finche' il numero e' diverso da 4!

        scanner.close();
    }
}