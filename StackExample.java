import java.util.*;

public class StackExample {
    public static void main(String args[]) {
        Stack<String> myStack = new Stack<String>();
        myStack.push("Person 1");
        myStack.push("Person 2");
        myStack.push("Person 3");
        myStack.push("Person 4");
        myStack.peek();
        Iterator<String> iterator = myStack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
