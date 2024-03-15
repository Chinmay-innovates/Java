package Basic;

public class Loops {
    public static void main(String[] args) {
        int i;
        System.out.println("Using For loop");
        for (i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        System.out.println("Using While loop");
        i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n");

        System.out.println("Using do-while loop");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
    }
}