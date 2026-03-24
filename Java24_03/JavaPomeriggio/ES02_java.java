package Java24_03.JavaPomeriggio;

import java.util.Scanner;

// Classe che rappresenta un videogioco
class Gioco {
    String titolo;
    String genere;
    double costoSviluppo;
    String statoProgetto;

    // Costruttore della classe Gioco
    Gioco(String titolo, String genere, double costoSviluppo, String statoProgetto) {
        this.titolo = titolo;
        this.genere = genere;
        this.costoSviluppo = costoSviluppo;
        this.statoProgetto = statoProgetto;
    }

    // Funzione per stampare i dati del gioco
    void stampaGioco() {
        System.out.println("Titolo: " + this.titolo);
        System.out.println("Genere: " + this.genere);
        System.out.println("Costo sviluppo: " + this.costoSviluppo);
        System.out.println("Stato progetto: " + this.statoProgetto);
    }
}

// Classe che rappresenta un team di sviluppo
class Team {
    String nomeTeam;
    int numeroSviluppatori;
    Gioco gioco; // Oggetto Gioco assegnato al team

    // Costruttore della classe Team
    Team(String nomeTeam, int numeroSviluppatori, Gioco gioco) {
        this.nomeTeam = nomeTeam;
        this.numeroSviluppatori = numeroSviluppatori;
        this.gioco = gioco;
    }

    // Funzione per stampare i dati del team e del gioco assegnato (se presente)
    void stampaTeam() {
        System.out.println("Nome team: " + this.nomeTeam);
        System.out.println("Numero sviluppatori: " + this.numeroSviluppatori);

        // Se il gioco è stato assegnato, lo stampa
        if (this.gioco != null) {
            System.out.println("Gioco assegnato:");
            this.gioco.stampaGioco();
        } else {
            System.out.println("Nessun gioco assegnato.");
        }
    }
}

public class ES02_java {
    // Scanner per input da tastiera
    static Scanner scanner = new Scanner(System.in);

    // Array di giochi disponibili
    static Gioco[] giochi = {
            new Gioco("Dark Souls", "Action RPG", 500000, "IN SVILUPPO"),
            new Gioco("FIFA 26", "Sport", 1200000, "IN TEST"),
            new Gioco("Minecraft 2", "Sandbox", 300000, "PUBBLICATO")
    };

    // Array di team disponibili
    static Team[] teams = {
            new Team("CloudGames", 5, null),
            new Team("GameIntro", 3, null),
            new Team("GammaAlpha", 7, null)
    };

    public static void main(String[] args) {
        int scelta = 0;

        // Ciclo principale del menu
        while (scelta != 5) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Assegna gioco a un team");
            System.out.println("2 - Visualizza tutti i team");
            System.out.println("3 - Cerca il gioco con costo di sviluppo più alto");
            System.out.println("4 - Modifica stato di un gioco");
            System.out.println("6 - Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();

            // Gestione delle scelte del menu
            switch (scelta) {
                case 1:
                    assegnaGioco();
                    break;
                case 2:
                    visualizzaTeam();
                    break;
                case 3:
                    costoSviluppoPiuAlto();
                    break;
                case 4:
                    modificaStatoGioco();
                    break;
                case 5:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
        scanner.close();
    }

    // Funzione per assegnare un gioco a un team
    static void assegnaGioco() {
        System.out.println("In quale team vuoi inserire il gioco? (1-3)");
        for (int i = 0; i < teams.length; i++) {
            System.out.println((i + 1) + " - " + teams[i].nomeTeam);
        }
        int sceltaTeam = scanner.nextInt() - 1;

        System.out.println("Quale gioco vuoi assegnare? (1-3)");
        for (int i = 0; i < giochi.length; i++) {
            System.out.println((i + 1) + " - " + giochi[i].titolo);
        }
        int sceltaGioco = scanner.nextInt() - 1;

        teams[sceltaTeam].gioco = giochi[sceltaGioco];
        System.out.println("Gioco assegnato con successo!");
    }

    // Funzione per visualizzare tutti i team e i giochi assegnati
    static void visualizzaTeam() {
        for (int i = 0; i < teams.length; i++) {
            teams[i].stampaTeam();
            System.out.println("-----");
        }
    }

    // Funzione per trovare e stampare il gioco con il costo di sviluppo più alto
    static void costoSviluppoPiuAlto() {
        if (giochi.length == 0) {
            System.out.println("Nessun gioco presente.");
            return;
        }

        Gioco max = giochi[0];
        for (int i = 1; i < giochi.length; i++) {
            if (giochi[i].costoSviluppo > max.costoSviluppo) {
                max = giochi[i];
            }
        }
        System.out.println("Gioco con costo di sviluppo più alto:");
        max.stampaGioco();
    }

    // Funzione per modificare lo stato di un gioco assegnato a un team
    static void modificaStatoGioco() {
        // Scegliere il team
        System.out.println("Scegli il team a cui appartiene il gioco da modificare (1-3):");
        for (int i = 0; i < teams.length; i++) {
            System.out.println((i + 1) + " - " + teams[i].nomeTeam);
        }
        int sceltaTeam = scanner.nextInt() - 1;

        // Controllo se il team ha un gioco assegnato
        if (teams[sceltaTeam].gioco == null) {
            System.out.println("Nessun gioco assegnato a questo team.");
            return;
        }

        // Mostra stato attuale e chiede il nuovo stato
        System.out.println("Stato attuale: " + teams[sceltaTeam].gioco.statoProgetto);
        System.out.println("Scegli il nuovo stato:");
        System.out.println("1 - IN SVILUPPO");
        System.out.println("2 - IN TEST");
        System.out.println("3 - PUBBLICATO");
        int sceltaStato = scanner.nextInt();

        // Modifica lo stato in base alla scelta
        switch (sceltaStato) {
            case 1:
                teams[sceltaTeam].gioco.statoProgetto = "IN SVILUPPO";
                break;
            case 2:
                teams[sceltaTeam].gioco.statoProgetto = "IN TEST";
                break;
            case 3:
                teams[sceltaTeam].gioco.statoProgetto = "PUBBLICATO";
                break;
            default:
                System.out.println("Scelta non valida.");
                return;
        }
        System.out.println("Stato modificato con successo!");
    }
}