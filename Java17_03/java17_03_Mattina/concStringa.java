import java.util.Arrays;

public class concStringa {
    public static void main(String[] args) {
        String firstName = "Umberto ";
        String lastName = "Carbone";

        // concatrenazione con segno + piu' String vuota
        System.out.println(firstName + " " + lastName);
        // concat method
        System.out.println(firstName.concat(lastName));

        // \' = singolo apice nella variabile in stringa
        String text = "Ciao, mi chiamo \'Umberto Carbone\'";
        System.out.println(text);
        // \" doppio apice
        String SecondText = "Prova la \"Seconda\" stringa";
        System.out.println(SecondText);
        // \n = testo a capo
        String textNewLine = "Prova il testo in \n newLine";
        System.out.println(textNewLine);
        // \r = ??
        String textReturn = "Prova il testo in \r R R R\r";
        System.out.println(textReturn);
        // \b \t \n \f \r \" \' \\

        //
        String str = "Ciao Come Stai ? ";
        String[] words = str.split("\\s");
        System.out.println(Arrays.toString(words));

        // lunghezza della stringa
        String ciclaLunghezza = "Ciao da Umberto Carbone";
        System.out.println(ciclaLunghezza.length());
    }
}
