import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        if (fact == 0 || fact < 0)
            System.out.println("number is too large !");
        else
            System.out.println("Factorial: " + fact);
    }

}