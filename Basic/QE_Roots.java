package Basic;

import java.util.Scanner;

/**
 * QE_Roots
 */
public class QE_Roots {

    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b and c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        sc.close();
        double root1, root2;
        double d = b * b - 4 * a * c;
        System.out.println("delta = " + d);
        if (a == 0) {
            System.out.println("it is a linear equation");
            return;
        } else if (d > 0) {
            root1 = (-b + Math.sqrt(d)) / 2 * a;
            root2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("roots are real and distinct");
            System.out.println("roots: " + root1 + " , " + root2);
        } else if (d == 0) {
            root1 = -b / 2 * a;
            System.out.println("roots are real and equal ");
            System.out.println("roots: " + root1 + " , " + root1);
        } else {
            System.out.println("no real roots");
            double real = -b / 2 * a;
            double img = Math.sqrt(-d) / 2 * a;
            System.out.println(real + " + " + img + "i");
            System.out.println(real + " - " + img + "i");
        }

    }
}