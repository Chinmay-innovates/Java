package Basic;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("inside throw one method");
        throw new IllegalAccessException("Access denied");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("caught: " + e.getMessage());
        } finally {
            System.out.println("End of throw one method");
        }
    }
}
