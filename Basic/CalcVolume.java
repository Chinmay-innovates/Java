package Basic;

// creating multiple objects using single class
class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return (width * height * depth);
    }
}

public class CalcVolume {
    public static void main(String[] args) {

        Box obj = new Box();
        Box obj2 = new Box();

        // 1st obj
        obj.width = 10;
        obj.height = 30;
        obj.depth = 30;
        System.out.println("Volume 1 : " + obj.volume());

        // 2nd obj
        obj2.width = 40;
        obj2.height = 20;
        obj2.depth = 60;
        System.out.println("Volume 2 : " + obj2.volume());
    }
}
