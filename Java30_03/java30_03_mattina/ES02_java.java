import java.util.Scanner;
import java.util.ArrayList;

//crea la class AUto
class Auto {
    String targa;
    String modello;

    // costruttore
    public Auto(String targa, String modello) {
        this.targa = targa;
        this.modello = modello;
    }
}

// crea class Officina
class Officina {
    String nome;
    ArrayList<Auto> auto = new ArrayList<>();

    // costruttore
    public Officina(String nome) {
        this.nome = nome;
    }

    // aggiunge un'auto all'officina
    void aggiungiAuto(Auto a) {
        auto.add(a);
    }

    // stampa l'elenco di tutte le auto
    void stampaAuto() {
        for (Auto a : auto) {
            System.out.println("Targa: " + a.targa + " | Modello: " + a.modello);
        }
    }
}

public class ES02_java {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Officina> officine = new ArrayList<>();

    public static void main(String[] args) {
        boolean continua = true;

        while (continua) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Crea nuova officina");
            System.out.println("2 - Aggiungi auto a un'officina");
            System.out.println("3 - Visualizza auto di un'officina");
            System.out.println("4 - Visualizza tutte le officine");
            System.out.println("5 - Esci");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    creaOfficina();
                    break;
                case 2:
                    aggiungiAuto();
                    break;
                case 3:
                    visualizzaAuto();
                    break;
                case 4:
                    visualizzaOfficine();
                    break;
                case 5:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }

    static void creaOfficina() {
        System.out.print("Nome officina: ");
        scanner.nextLine(); // pulizia buffer
        String nome = scanner.nextLine();

        // crea e aggiunge la nuova officina alla lista
        officine.add(new Officina(nome));
        System.out.println("Officina " + nome + " creata!");
    }

    static void visualizzaOfficine() {
        if (officine.isEmpty()) {
            System.out.println("Nessuna officina disponibile.");
            return;
        }

        System.out.println("\n--- OFFICINE ---");
        for (int i = 0; i < officine.size(); i++) {
            System.out.println((i + 1) + " - " + officine.get(i).nome);
        }
    }

    static void aggiungiAuto() {
        if (officine.isEmpty()) {
            System.out.println("Nessuna officina disponibile.");
            return;
        }

        // mostra la lista delle officine
        visualizzaOfficine();
        System.out.print("Scegli officina: ");
        int scelta = scanner.nextInt();

        if (scelta < 1 || scelta > officine.size()) {
            System.out.println("Scelta non valida.");
            return;
        }

        System.out.print("Targa: ");
        scanner.nextLine(); // pulizia buffer
        String targa = scanner.nextLine();

        System.out.print("Modello: ");
        String modello = scanner.nextLine();

        // aggiunge l'auto all'officina scelta
        officine.get(scelta - 1).aggiungiAuto(new Auto(targa, modello));
        System.out.println("Auto aggiunta!");
    }

    static void visualizzaAuto() {
        if (officine.isEmpty()) {
            System.out.println("Nessuna officina disponibile.");
            return;
        }

        // mostra la lista delle officine
        visualizzaOfficine();
        System.out.print("Scegli officina: ");
        int scelta = scanner.nextInt();

        if (scelta < 1 || scelta > officine.size()) {
            System.out.println("Scelta non valida.");
            return;
        }

        Officina o = officine.get(scelta - 1);

        if (o.auto.isEmpty()) {
            System.out.println("Nessuna auto in questa officina.");
            return;
        }

        System.out.println("\n--- AUTO DI " + o.nome + " ---");
        // chiama il metodo stampaAuto dell'officina scelta
        o.stampaAuto();
    }
}