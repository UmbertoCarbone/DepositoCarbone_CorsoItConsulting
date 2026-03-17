public class provaStringa {
    public static void main(String[] args) {
        String parola = "Java isn't JavaScript!";
        String prova = "Please locate where 'locate' occurs!";
        // metodo per sapere la lunghezza della stringa
        System.out.println(parola.length());
        // metodo per input lettera GRANDE
        System.out.println(parola.toUpperCase());
        // metodo per input lettera PICCOLE
        System.out.println(parola.toLowerCase());
        
        // metodo indexOf che restituisce l'indice delle prima occorenza di un testo
        System.out.println(prova.indexOf("locate"));
    }
}
