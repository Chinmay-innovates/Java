package Basic;

import java.util.Scanner;

class Student {
    int stdNo;
    String name;
    int marks;

    // constructor
    public Student(int stdNo, String name, int marks) {
        this.stdNo = stdNo;
        this.name = name;
        this.marks = marks;
    }

}

public class MultipleObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student no. " + (i + 1) + " name and marks");
            String name = sc.next();
            int marks = sc.nextInt();
            Student s = new Student(i + 1, name, marks);
            students[i] = s;
        }
        for (Student s : students) {
            System.out
                    .println("{ name : " + s.name + " , " + "marks : " + s.marks + " , " + "stdno : " + s.stdNo + " }");
        }
        sc.close();

    }

}
