import java.util.*;

public class One {
   
    Random rand = new Random();
    int numbers() {
    int first = 0;
    int second = 1;
    int result = rand.nextInt(first - second) + second;
    return result;
    }

    public static void main(String args[]) {
        One o = new One();
     System.out.println(o.numbers());
    }
}
