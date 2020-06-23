import java.io.IOException;

public class throwException {
    void method1() {
        int mynumber = 29 / 0;
    }

    void method2() {
        method1();
    };

    void method3() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Handling exception");
        }
    //method2();
    }

    public static void main(String args[]) {
        throwException te = new throwException();
        te.method3();
        //System.out.println("Running without exception");
    }
}
