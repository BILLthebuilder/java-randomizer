import java.util.Random;
import java.util.Scanner;

public class Inputs {
    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);

    static int numbers() {
        System.out.println("Enter the first number");
        int min = scanner.nextInt();
        System.out.println("Enter the second number");
        int max = scanner.nextInt();
        int result = rand.nextInt((max - min) + 1) + min;
        System.out.println("The random number is:");
        try {
            System.out.println(result); 
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;  
    }
    public static void main(String args[]) {
        numbers();
    }
}
