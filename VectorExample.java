import java.util.*;

public class VectorExample {
    
    public static void main(String args[]) {
        Vector<Integer> myVector = new Vector<Integer>();
        Iterator<Integer> iterator = myVector.iterator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add numbers to the vector and press enter");
        int numbers = scanner.nextInt();
        myVector.add(numbers);
        scanner.close();

        System.out.println(myVector);
        while (iterator.hasNext()) {
        System.out.println(iterator.next());
        }
    }
}
