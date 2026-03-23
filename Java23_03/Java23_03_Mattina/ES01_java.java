package Java23_03.Java23_03_Mattina;

import java.util.Scanner;

class ES01_java {

    public static void main(String[] args) {

        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome ");
        String nome = scannerStr.nextLine();

        System.out.println("Inserisci il tuo anno di nascita ");
        int anno = scannerInt.nextInt();

        System.out.println("Inserisci il giorno della settimana in base al numero elencati sotto ");
        System.out.println("1 = Lunedi");
        System.out.println("2 = Martedi");
        System.out.println("3 = Mercoledi");
        System.out.println("4 = Giovedi");
        System.out.println("5 = venerdi");
        System.out.println("6 = Sabato");
        System.out.println("7 = Domenica");
        int giornoSettimana = scannerInt.nextInt();

        int giorniAlSabato = 6 - giornoSettimana;
        if (giorniAlSabato < 0) {
            giorniAlSabato += 7;
        }

        System.out.println("Il mnio nome è " + nome + ", sono nato nell\'anno " + anno + " e mancano " + giorniAlSabato
                + " giorni al weekend!");
    }
}