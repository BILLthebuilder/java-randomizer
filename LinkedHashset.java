import java.util.*;

public class LinkedHashset {
    public static void main(String args[]) {
       LinkedHashSet<String> myStack = new LinkedHashSet<String>();
        myStack.add("");
        myStack.add("Person 2");
        myStack.add("Person 3");
        myStack.add("Person 1");
        Iterator<String> iterator = myStack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
