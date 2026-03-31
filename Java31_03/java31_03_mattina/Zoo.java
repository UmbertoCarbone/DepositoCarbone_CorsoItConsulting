package Java31_03.java31_03_mattina;

import java.util.ArrayList;

//oggetto
class Animale {
    String nome;
    int eta;

    // costruttore
    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // metodo
    public void faiVerso() {
        System.out.println("Verso generico");
    };
}
// estensione della classe Animale
class Cane extends Animale {
    public Cane(String nome, int eta) {
        super(nome, eta);
    }
// override del metodo faiVerso
    @Override
    public void faiVerso() {
        System.out.println("Bau!");
    }
}
// estensione della classe Animale
class Gatto extends Animale {
    public Gatto(String nome, int eta) {
        super(nome, eta);
    }
// override del metodo faiVerso
    @Override
    public void faiVerso() {
        System.out.println("Miao!");
    }
}
// classe principale
public class Zoo {
    public static void main(String[] args) {
        System.out.println("Lista degli animali:");
        // Animale generico
        ArrayList<Animale> animali = new ArrayList<>();

        animali.add(new Animale("Fido", 3));
        animali.add(new Animale("Whiskers", 2));
        animali.add(new Animale("Maxi", 8));
        animali.add(new Animale("Whiskers", 5));

        for (Animale a : animali) {
            System.out.println(a.nome + " ha " + a.eta + " anni e fa: ");
            a.faiVerso();
            System.out.println("---");
        }
        System.out.println("\nLista dei cani:");
        // lista dei cani
        ArrayList<Animale> cani = new ArrayList<>();
        cani.add(new Cane("Fido", 3));
        cani.add(new Cane("Maxi", 8));
        cani.add(new Cane("Doggo", 5));

        for (Animale c : cani) {
            System.out.println(c.nome + " ha " + c.eta + " anni e fa: ");
            c.faiVerso();
            System.out.println("---");
        }
        // listai dei gatti
        System.out.println("\nLista dei gatti:");
        ArrayList<Animale> gatti = new ArrayList<>();

        gatti.add(new Gatto("NiHao", 2));
        gatti.add(new Gatto("Miao", 5));

        for (Animale g : gatti) {
            System.out.println(g.nome + " ha " + g.eta + " anni e fa: ");
            g.faiVerso();
            System.out.println("---");
        }

    }
}
