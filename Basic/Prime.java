package Basic;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("testing prime, enter a number...");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        boolean flag = false;
        if (n == 0 || n == 1)
            System.out.println("neither prime nor composite ");
        else {
            if (n < 0)
                System.out.println("enter a positive number");
            else {
                for (int i = 2; i < n / 2; i++) {
                    if (n % i == 0) {
                        flag = true;
                        break;
                    }

                }

                if (!flag)
                    System.out.println(n + " is prime");
                else
                    System.out.println(n + " is not prime");
            }

        }

    }
}
