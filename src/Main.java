public class Main {

    public static void main(String[] args) {

        boolean A = 2 <= 2 && !true;
        System.out.println("La booleana A è: " + A);

        boolean B = !false && 3 > 2;
        System.out.println("La booleana B è: " + B);

        boolean C = !(!false || true);
        System.out.println("La booleana C è: " + C);

        boolean D = 6 > 6 ^ !(true && true);
        System.out.println("La booleana D è: " + D);

    }
}