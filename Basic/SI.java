package Basic;

import java.util.*;

public class SI {
    public static void main(String[] args) {
        System.out.println("enter p,t,r values");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        float r = sc.nextFloat();
        sc.close();
        float si = (float) (p * r * t) / 100;
        System.out.println("Simple Interest : " + si);
    }

}
