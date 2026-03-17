public class provecasting {
    public static void main(String[] args) {
        //implicita // coercizione
        int myInt = 9;

        double myDouble = myInt;

        System.out.println(myInt);

        System.out.println(myDouble);
        //casting // attiva
        double myDoubleB = 9.78d;

        int newInt = (int) myDoubleB;

        System.out.println(myDoubleB);

        System.out.println(newInt);
    }
}
