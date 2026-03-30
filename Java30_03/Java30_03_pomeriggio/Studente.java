package Java30_03_pomeriggio;
import java.util.ArrayList;

public class Studente {
    
    private String nome;
    private int voto;
    private static int contatore = 0; 
    private int id;

    // Costruttore pubblico
    public Studente(String nome, int voto) {
        this.nome = nome;
        this.id = ++contatore;
        setVoto(voto); // usa il setter per validare
    }

    // Getter per nome //!
    public String getNome() {
        return nome;
    }

    // Getter per voto //!
    public int getVoto() {
        return voto;
    }

    // Getter per id //!
    public int getId() {
        return id;
    }

    // Setter per voto con validazione
    public void setVoto(int voto) {
        if (voto > 0 && voto <= 10) {
            this.voto = voto;
        } else {
            this.voto = 1;
            System.out.println("Errore: il voto deve essere compreso tra 0 e 10.");
        }
    }

    // Metodo per stampare le info dello studente
    public void stampaInfo() {
        System.out.println("ID: " + id + " | Nome: " + nome + " | Voto: " + voto);
    }

    public static void main(String[] args) {
        ArrayList<Studente> studenti = new ArrayList<>();
        studenti.add(new Studente("Mario", 8));
        studenti.add(new Studente("Antonio", 10));
        studenti.add(new Studente("Luca", 7));
        studenti.add(new Studente("Anna", 9));
        studenti.add(new Studente("Sara", 11));
        studenti.add(new Studente("Sara", 6));

        for (Studente s : studenti) {
            // validazione voto 
            s.stampaInfo();
        }
    }
}