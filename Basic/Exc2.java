package Basic;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 24 / 43;
            System.out.println("Value of a: " + a);
            a = 43 / 8;
            System.out.println("Value of a: " + a);
            a = 10 / d;
            System.out.println("Value of a: " + a);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero\n" + e.getMessage());
        } finally {
            System.out.println("End of the program");
        }
    }
}
