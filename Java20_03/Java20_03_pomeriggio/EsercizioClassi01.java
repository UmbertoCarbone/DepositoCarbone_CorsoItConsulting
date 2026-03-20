package Java20_03.Java20_03_pomeriggio;

class Libro {
    String titolo;
    String autore;
    double prezzo;
    static int codice = 0;

    Libro(String titolo, String autore, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        codice += 1;
    }

    void stampa() {
        System.out.println(this.titolo + this.autore + this.prezzo);
    }
}

public class EsercizioClassi01 {
    public static void main(String[] args) {
        Libro mioLibro1 = new Libro("nomelibro1", "autorelibro1", 19.99);
        Libro mioLibro2 = new Libro("nomelibro2", "autorelibro2", 29.99);
        mioLibro1.stampa();
        mioLibro2.stampa();

    }

}
