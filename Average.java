import java.util.Scanner;

public class Average {
    Scanner scanner = new Scanner(System.in);
    
    public void average() {
        System.out.println("Enter numbers for average");
        int[] numbers = new int[3];
        double totals = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scanner.nextInt();
        }
        totals = average(numbers);
    }

    double average(int[] values) {
        double average = 0;
        for (int i : values) {
            average = i + i / values.length;
        }

        return average;
    }

    public static void main(String args[]) {
        Average av = new Average();
        av.average();
    }
}
