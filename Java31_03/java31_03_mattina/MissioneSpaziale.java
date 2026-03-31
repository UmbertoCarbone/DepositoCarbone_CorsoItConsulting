package Java31_03.java31_03_mattina;

import java.util.Scanner;
import java.util.ArrayList;

class Astronauta {
    String nome;
    String email;
    float creditoOssigeno;

    public Astronauta(String nome, String email) {
        this.nome = nome;
        this.email = email;
        // ossigeno casuale tra 0 e 100 al login
        this.creditoOssigeno = (float) (Math.random() * 100);
    }

    // stampa i dati dell'astronauta
    void visualizzaDati() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Ossigeno: " + creditoOssigeno);
    }

    // rigenera ossigeno casuale al login
    void OssigenoRandom() {
        this.creditoOssigeno = (float) (Math.random() * 100);
        System.out.println("Login effettuato! Ossigeno: " + creditoOssigeno);
    }
}

class StazioneSpaziale {
    // lista di esperimenti e valutazioni
    ArrayList<String> esperimenti = new ArrayList<>();
    ArrayList<Integer> valutazioni = new ArrayList<>();

    // aggiunge un esperimento alla stazione
    void aggiungiEsperimento(String esperimento) {
        esperimenti.add(esperimento);
        System.out.println("Esperimento aggiunto: " + esperimento);
    }

    // aggiunge una valutazione alla stazione (deve essere tra 1 e 5)
    void aggiungiValutazione(int valutazione) {
        if (valutazione >= 1 && valutazione <= 5) {
            valutazioni.add(valutazione);
            System.out.println("Valutazione aggiunta: " + valutazione);
        } else {
            System.out.println("Errore! La valutazione deve essere tra 1 e 5.");
        }
    }

    // stampa tutti gli esperimenti
    void stampaEsperimenti() {
        System.out.println("--- ESPERIMENTI ---");
        for (int i = 0; i < esperimenti.size(); i++) {
            System.out.println((i + 1) + " - " + esperimenti.get(i));
        }
    }

    // stampa tutte le valutazioni
    void stampaValutazioni() {
        System.out.println("--- VALUTAZIONI ---");
        for (int i = 0; i < valutazioni.size(); i++) {
            System.out.println((i + 1) + " - " + valutazioni.get(i));
        }
    }
}

class Scienziato extends Astronauta {
    int azioniSvolte = 0;

    public Scienziato(String nome, String email) {
        super(nome, email); // chiama il costruttore di Astronauta
    }

    // aggiunge un esperimento alla stazione
    void aggiungiEsperimento(StazioneSpaziale stazione) {
        System.out.print("Nome esperimento: ");
        String esperimento = new Scanner(System.in).nextLine();
        stazione.aggiungiEsperimento(esperimento);
        azioniSvolte++;
    }

    @Override
    void visualizzaDati() {
        super.visualizzaDati(); // stampa nome, email, ossigeno
        System.out.println("Ruolo: Scienziato");
        System.out.println("Azioni svolte: " + azioniSvolte);
    }
}

class Ispettore extends Astronauta {
    int azioniSvolte = 0;

    public Ispettore(String nome, String email) {
        super(nome, email); // chiama il costruttore di Astronauta
    }

    // aggiunge una valutazione alla stazione
    void aggiungiValutazione(StazioneSpaziale stazione) {
        System.out.print("Valutazione (1-5): ");
        int valutazione = new Scanner(System.in).nextInt();
        stazione.aggiungiValutazione(valutazione);
        azioniSvolte++;
    }

    @Override
    void visualizzaDati() {
        super.visualizzaDati(); // stampa nome, email, ossigeno
        System.out.println("Ruolo: Ispettore");
        System.out.println("Azioni svolte: " + azioniSvolte);
    }
}

class ScienziatiCapo extends Scienziato {

    public ScienziatiCapo(String nome, String email, int azioniSvolte) {
        super(nome, email);
        this.azioniSvolte = azioniSvolte;
    }

    // stampa tutti gli esperimenti in una sola operazione
    void stampaTuttiEsperimenti(StazioneSpaziale stazione) {
        System.out.println("--- TUTTI GLI ESPERIMENTI ---");
        stazione.stampaEsperimenti();
    }

    @Override
    void visualizzaDati() {
        super.visualizzaDati();
        System.out.println("Ruolo avanzato: Scienziato Capo");
    }
}

class IspettoreEsperto extends Ispettore {

    public IspettoreEsperto(String nome, String email, int azioniSvolte) {
        super(nome, email);
        this.azioniSvolte = azioniSvolte;
    }

    // stampa tutte le valutazioni in una sola operazione
    void stampaTutteValutazioni(StazioneSpaziale stazione) {
        System.out.println("--- TUTTE LE VALUTAZIONI ---");
        stazione.stampaValutazioni();
    }

    @Override
    void visualizzaDati() {
        super.visualizzaDati();
        System.out.println("Ruolo avanzato: Ispettore Esperto");
    }
}

public class MissioneSpaziale {

    static Scanner scanner = new Scanner(System.in);
    static StazioneSpaziale stazione = new StazioneSpaziale();
    static Astronauta astronauta = null;

    public static void main(String[] args) {
        boolean continua = true;

        while (continua) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Crea astronauta");
            System.out.println("2 - Visualizza dati astronauta");
            System.out.println("3 - Login (rigenera ossigeno)");
            System.out.println("4 - Interagisci con profilo");
            System.out.println("5 - Stampa dati in base al ruolo");
            System.out.println("6 - Esci");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:1
                
                    creaAstronauta();
                    break;
                case 2:
                    visualizzaDati();
                    break;
                case 3:
                    OssigenoRandom();
                    break;
                case 4:
                    interagisci();
                    break;
                case 5:
                    stampaInBaseAlRuolo();
                case 6:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }

    static void creaAstronauta() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        // chiede il ruolo all'utente
        System.out.print("Sei uno Scienziato o Ispettore? (s/i): ");
        String ruolo = scanner.nextLine();

        if (ruolo.equalsIgnoreCase("s")) {
            astronauta = new Scienziato(nome, email);
            System.out.println("Scienziato creato!");
        } else if (ruolo.equalsIgnoreCase("i")) {
            astronauta = new Ispettore(nome, email);
            System.out.println("Ispettore creato!");
        } else {
            System.out.println("Ruolo non valido.");
        }
    }

    static void visualizzaDati() {
        if (astronauta != null) {
            astronauta.visualizzaDati();
        } else {
            System.out.println("Nessun astronauta creato.");
        }
    }

    static void OssigenoRandom() {
        if (astronauta == null) {
            System.out.println("Nessun astronauta creato.");
            return;
        }
        // rigenera ossigeno casuale
        astronauta.OssigenoRandom();
    }

    static void interagisci() {
        if (astronauta == null) {
            System.out.println("Nessun astronauta creato.");
            return;
        }

        // controlla se è Scienziato o Ispettore
        if (astronauta instanceof ScienziatiCapo) {
            ScienziatiCapo sc = (ScienziatiCapo) astronauta;
            sc.aggiungiEsperimento(stazione);
            sc.stampaTuttiEsperimenti(stazione);

        } else if (astronauta instanceof Scienziato) {
            Scienziato s = (Scienziato) astronauta;
            s.aggiungiEsperimento(stazione);

            // dopo 3 azioni diventa ScienziatiCapo
            if (s.azioniSvolte >= 3) {
                System.out.println("Sei diventato Scienziato Capo!");
                astronauta = new ScienziatiCapo(s.nome, s.email, s.azioniSvolte);
            }

        } else if (astronauta instanceof IspettoreEsperto) {
            IspettoreEsperto ie = (IspettoreEsperto) astronauta;
            ie.aggiungiValutazione(stazione);
            ie.stampaTutteValutazioni(stazione);

        } else if (astronauta instanceof Ispettore) {
            Ispettore i = (Ispettore) astronauta;
            i.aggiungiValutazione(stazione);

            // dopo 3 azioni diventa IspettoreEsperto
            if (i.azioniSvolte >= 3) {
                System.out.println("Sei diventato Ispettore Esperto!");
                astronauta = new IspettoreEsperto(i.nome, i.email, i.azioniSvolte);
            }
        }
    }

    static void stampaInBaseAlRuolo() {
    if (astronauta == null) {
        System.out.println("Nessun astronauta creato.");
        return;
    }
    if (astronauta instanceof Scienziato) {
        stazione.stampaEsperimenti();
    } else if (astronauta instanceof Ispettore) {
        stazione.stampaValutazioni();
    }
}
}
