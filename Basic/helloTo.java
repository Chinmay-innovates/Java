package Basic;

import java.util.*;

class HelloTo {
    public static void main(String[] args) {

        // ---- SCAN INPUT ----
        Scanner sc = new Scanner(System.in);

        // int take_integer = sc.nextInt();
        // float take_float = sc.nextFloat();
        // boolean take_boolean = sc.nextBoolean();
        // char take_char = sc.next().charAt(0);
        // String take_string = sc.nextLine();
        // String take_string2 = sc.next();
        // byte take_byte = sc.nextByte();

        sc.close();

        // --------------- SWITCH CASE---------------

        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello ");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid button");

                // }

                // --------------- ELIF CASES---------------
                int a = sc.nextInt();
                int b = sc.nextInt();
                sc.close();
                if (a == b) {
                    System.out.println("equal");
                } else if (a > b) {
                    System.out.println("a is greater ");
                } else {

                    System.out.println("b is greater ");
                }

                // --------------- AGE CHECKING ---------------
                System.out.println("Enter Your Age");
                int age = sc.nextInt();
                if (age > 18) {
                    System.out.println("You are an Adult");
                } else {
                    System.out.println("You are a Child");
                }

                // --------------- ODD EVEN ---------------
                System.out.println("Enter a Number");
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    System.out.println("Even Number");
                } else {
                    System.out.println("Odd Number");
                }

                // --------------- SUM ---------------
                System.out.println("Enter two numbers");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                int sum = a1 + b1;
                System.out.println(sum);

                // --------------- INPUT ---------------
                String name = sc.nextLine();
                // nextInt();
                // nextFloat();
                System.out.println(name);

                // ---- CLOSING INPUT ----
        }
    }
}