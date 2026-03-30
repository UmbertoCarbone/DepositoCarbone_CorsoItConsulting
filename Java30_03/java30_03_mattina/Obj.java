import java.util.ArrayList;

class Auto {
    String marca;
    int anno;

    Auto(String marca, int anno) {
        this.marca = marca;
        this.anno = anno;
    }

    public String toString() {
    return "Nome: " + marca + " Eta: " + anno;
}
}

public class Obj {
    public static void main(String[] args) {
        ArrayList<Auto> autoList = new ArrayList<>();
        autoList.add(new Auto("Tesla", 2023));
        autoList.add(new Auto("Ford", 2020));
        for (

        Auto auto : autoList) {
            System.out.println(auto.marca + " - " + auto.anno);
        }
    }

}