package Java30_03_pomeriggio;

import java.util.ArrayList;

// Classe Aereo
class Aereo {
    private String modello;
    private int numeroPosti;
    private String codice;

    public Aereo(String modello, int numeroPosti, String codice) {
        this.modello = modello;
        setNumeroPosti(numeroPosti);
        this.codice = codice;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(int numeroPosti) {
        if (numeroPosti > 0) {
            this.numeroPosti = numeroPosti;
        } else {
            System.out.println("Errore: numero posti deve essere positivo.");
        }
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }
}

// Classe Pilota
class Pilota {
    private String nome;
    private String numeroBrevetto;
    private int oreVolo;

    public Pilota(String nome, String numeroBrevetto, int oreVolo) {
        this.nome = nome;
        this.numeroBrevetto = numeroBrevetto;
        setOreVolo(oreVolo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroBrevetto() {
        return numeroBrevetto;
    }

    public void setNumeroBrevetto(String numeroBrevetto) {
        this.numeroBrevetto = numeroBrevetto;
    }

    public int getOreVolo() {
        return oreVolo;
    }

    public void setOreVolo(int oreVolo) {
        if (oreVolo > 0) {
            this.oreVolo = oreVolo;
        } else {
            System.out.println("Errore: le ore di volo devono essere maggiori di zero.");
        }
    }
}

// Classe CompagniaAerea
class CompagniaAerea {
    private String nome;
    private ArrayList<Aereo> flotta;
    private ArrayList<Pilota> piloti;

    public CompagniaAerea(String nome) {
        this.nome = nome;
        this.flotta = new ArrayList<>();
        this.piloti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aggiungiAereo(Aereo aereo) {
        flotta.add(aereo);
    }

    public void aggiungiPilota(Pilota pilota) {
        piloti.add(pilota);
    }

    public void stampaInfo() {
        System.out.println("Compagnia: " + nome);
        System.out.println("Aerei in flotta:");
        for (Aereo a : flotta) {
            System.out.println(
                    "- Modello: " + a.getModello() + ", Posti: " + a.getNumeroPosti() + ", Codice: " + a.getCodice());
        }
        System.out.println("Piloti:");
        for (Pilota p : piloti) {
            System.out.println("- Nome: " + p.getNome() + ", Brevetto: " + p.getNumeroBrevetto() + ", Ore volo: "
                    + p.getOreVolo());
        }
    }
}

// Classe principale per test
public class ES02_java {
    public static void main(String[] args) {
        // Crea aerei
        Aereo a1 = new Aereo("Boeing 737", 180, "A123");
        Aereo a2 = new Aereo("Airbus A320", 150, "B456");
        Aereo a3 = new Aereo("prova1 737", 180, "Y565");
        Aereo a4 = new Aereo("prova2 A320", 150, "X468");

        // Crea piloti
        Pilota p1 = new Pilota("Mario Rossi", "BR456", 1200);
        Pilota p2 = new Pilota("Luca Bianchi", "BR787", 200);
        Pilota p3 = new Pilota("Umberto Carbone", "BR231", 400);
        Pilota p4 = new Pilota("Luca Bianchi", "BR17", 765);

        // Crea compagnia e aggiungi aerei e piloti
        CompagniaAerea compagnia = new CompagniaAerea("SkyFly");
        compagnia.aggiungiAereo(a1);
        compagnia.aggiungiAereo(a2);
        compagnia.aggiungiPilota(p1);
        compagnia.aggiungiPilota(p2);

        CompagniaAerea compagnia2 = new CompagniaAerea("AirVolo");
        compagnia2.aggiungiAereo(a3);
        compagnia2.aggiungiAereo(a4);
        compagnia2.aggiungiPilota(p3);
        compagnia2.aggiungiPilota(p4);

        // Stampa info
        compagnia.stampaInfo();
        compagnia2.stampaInfo();
    }
}