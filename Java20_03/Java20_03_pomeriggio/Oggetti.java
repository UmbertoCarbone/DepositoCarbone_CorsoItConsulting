package Java20_03.Java20_03_pomeriggio;

class Auto {
    // variabile d'istanza
    String marca;
    int anno;
    double prezzo;

    void mostraInfo() {
        System.out.println(marca + " - " + anno + " - $" + prezzo);
    }
}

class Studente {
    String nome; // vabiarbile
    static int totaleStudenti = 0;

    Studente(String nome) {
        this.nome = nome;
        totaleStudenti++;
    }
}

public class Oggetti {
    public static void main(String[] args) {
        Auto miaAuto = new Auto(); // crea oggetto
        // assegna valori
        miaAuto.marca = "Tesla";
        miaAuto.anno = 2020;
        miaAuto.prezzo = 4999.99;

        miaAuto.mostraInfo();

        

    }
}
