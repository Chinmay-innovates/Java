import java.util.*;
//import java.lang.Math;

public class CircleArea {

    public static void main(String[] args) {

        System.out.println("radius = ?");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();

        double area = Math.PI * r * r;
        System.out.println("Area: " + area);
    }

}