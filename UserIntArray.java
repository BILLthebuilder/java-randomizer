import java.util.Scanner;

public class UserIntArray {
    int add(int[] values) {
        int sum = 0;
        for (int i : values) {
            sum  += i;
        }

        return sum;
    }
    void arrayViewer() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int totals = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The numbers are:");
        for (int i : numbers) {
            System.out.println(i);
        }
        totals = add(numbers);
        System.out.println("The sum is:" + totals);
}

public static void main(String args[]) {
    UserIntArray a = new UserIntArray();
    // a.arrayViewer();
    int[] digits = { 1, 2, 3, 4, 5 };
    System.out.println(  a.add(digits));
  
    }

}
