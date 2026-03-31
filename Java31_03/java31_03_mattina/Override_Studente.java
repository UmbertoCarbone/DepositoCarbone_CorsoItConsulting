package Java31_03.java31_03_mattina;

public class Override_Studente {
    private String nome;
    private int eta;

    // Costruttore
    public Override_Studente(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Override del metodo toString()
    @Override
    public String toString() {
        return "Studente: " + nome + ", Età: " + eta;
    }

    // Metodo main per testare
    public static void main(String[] args) {
        Override_Studente s1 = new Override_Studente("Luca", 20);
        System.out.println(s1); // Chiama automaticamente toString()
    }
}