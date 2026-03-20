package Java20_03.Java20_03_pomeriggio;

class Persona {
    String nome;
    int eta;
    String citta;

    void mostraInfo() {
        System.out.println("Mi chiamo " + nome);
        System.out.println("Ho " + eta + " anni");
        System.out.println("Vivo a " + citta);
    }

    Persona(String nome, int eta, String citta) {
        this.nome = nome;
        this.eta = eta;
        this.citta = citta;
    }

}

public class EsercizioClassi02 {
    public static void main(String[] args) {
        Persona primaPersona = new Persona("Umberto", 29, "Boscoreale");
        Persona secondaPersona = new Persona("Mario", 35, "Napoli");

        primaPersona.mostraInfo();
        secondaPersona.mostraInfo();

        // log di prova
        System.out.println(primaPersona);
        System.out.println(secondaPersona);
    }
}
