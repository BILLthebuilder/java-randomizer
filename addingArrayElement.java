import java.util.Scanner;

public class addingArrayElement {
    public static void main(String args[]) {
        Scanner getNumber = new Scanner(System.in);
        int[] number = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter array element");
            number[i] = getNumber.nextInt();
        }
        total = Addition(number);
        System.out.println("The total value is:" + total + " ");
        System.out.println("Array elements");
        for (int i : number) {
            System.out.println(i);
        }
    }
    
    public static int Addition(int[] passedValue) {
        int summation = 0;
        for (int i = 0; i < 5; i++) {
            summation = +passedValue[i];
        }
        return summation;
    }
}
