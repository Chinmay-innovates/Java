package Basic;

class Test {
    int stdNo;
    String name;
    int marks;

}

public class Student {
    public static void main(String[] args) {
        Test s1 = new Test();
        s1.stdNo = 1;
        s1.marks = (int) (Math.random() * 100);
        s1.name = "bob";
        System.out.println(" name : " + s1.name + " stdNo : " + s1.stdNo + " marks : " + s1.marks);

        Test s2 = new Test();
        s2.stdNo = 2;
        s2.marks = (int) (Math.random() * 100);
        s2.name = "ron";
        System.out.println(" name : " + s2.name + " stdNo : " + s2.stdNo + " marks : " + s2.marks);

        Test s3 = new Test();
        s3.stdNo = 3;
        s3.marks = (int) (Math.random() * 100);
        s3.name = "sam";
        System.out.println(" name : " + s3.name + " stdNo : " + s3.stdNo + " marks : " + s3.marks);

        for (int i = 0; i < 3; i++) {
            Test s = new Test();
            s.marks = (int) (Math.random() * 100);
            s.name = "bob ";
            System.out.println("{ name : " + s.name + (i + 1) + " stdNo : " + (i + 1) + " marks : " + s.marks + " }");
        }

    }
}
