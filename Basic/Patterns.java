package Basic;

import java.util.Scanner;

public class Patterns {

    static int m = 5;
    static int n = 5;

    public static int fact(int i) {
        if (i == 0) {
            return 1;
        }
        return i * fact(i - 1);
    }

    public static void main(String[] args) {
        System.out.println("enter row and col value : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        System.out.println("\nSolid Rectangle\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nHollow Rectangle\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // cell -> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\nHalf Pyramid\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nInverted Half Pyramid\n");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nInverted Half Pyramid(rotated 180 deg)\n");
        for (int i = 1; i <= n; i++) {
            // inner loop -> space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\nHalf Pyramid with numbers\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nInverted Half Pyramid  with numbers\n");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nFloyd's Triangle \n");
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        System.out.println("\n0-1 Triangle \n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println("\nButterfly Pattern\n");
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // lower half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("\nSolid Rhombus\n");
        for (int i = 1; i < n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        System.out.println("\nHollow Rhombus\n");
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= m; j++) {
                // cell -> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

        System.out.println("\nNumber Pyramid\n");
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers print row no, row no. times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }

        System.out.println("\nPalindrome Pyramid\n");
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // 1st half numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // 2nd half numbers

            // if j=1 then 1 prints twice
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPalindrome Pyramid | 2\n");
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // 1st half numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // 2nd half numbers

            // if j=1 then 1 prints twice
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPascal Triangle\n");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("   ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("    " + fact(i) / (fact(i - k) * fact(k)));
            }

            System.out.println();
        }

    }

}
/*
 * 
 * enter row and col value :
 * 7 6
 * 
 * Solid Rectangle
 *******
 *******
 *******
 *******
 *******
 *******
 * 
 * 
 * Hollow Rectangle
 *******
 * 
 * *
 * *
 * *
 * *
 *******
 * 
 * Half Pyramid
 *
 **
 ***
 ****
 *****
 ******
 * 
 * 
 * Inverted Half Pyramid
 ******
 *****
 ****
 ***
 **
 *
 * 
 * 
 * Inverted Half Pyramid(rotated 180 deg)
 *
 **
 ***
 ****
 *****
 ******
 * 
 * 
 * Half Pyramid with numbers
 * 
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 1 2 3 4 5 6
 * 
 * Inverted Half Pyramid with numbers
 * 
 * 1 2 3 4 5 6
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 * 
 * Floyd's Triangle
 * 
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * 16 17 18 19 20 21
 * 
 * 0-1 Triangle
 * 
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 * 0 1 0 1 0 1
 * 
 * Butterfly Pattern
 * 
 * *
 ** **
 *** ***
 **** ****
 ***** *****
 ************
 ************
 ***** *****
 **** ****
 *** ***
 ** **
 * *
 * 
 * Solid Rhombus
 * 
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * 
 * Hollow Rhombus
 * 
 * * * * * * *
 * *
 * *
 * *
 * *
 * * * * * * *
 * 
 * Number Pyramid
 * 
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 * 6 6 6 6 6 6
 * 
 * Palindrome Pyramid
 * 
 * 1
 * 2 1 2
 * 3 2 1 2 3
 * 4 3 2 1 2 3 4
 * 5 4 3 2 1 2 3 4 5
 * 6 5 4 3 2 1 2 3 4 5 6
 * 
 * Palindrome Pyramid | 2
 * 
 * 1 1
 * 2 1 1 2
 * 3 2 1 1 2 3
 * 4 3 2 1 1 2 3 4
 * 5 4 3 2 1 1 2 3 4 5
 * 6 5 4 3 2 1 1 2 3 4 5 6
 * 
 * Pascal Triangle
 * 
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * 1 6 15 20 15 6 1
 * PS C:\Users\Admin\Desktop\java-practice>
 */