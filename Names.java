import java.util.Random;
public class Names {
    static String names[] = { "Eugenia", "Brian", "Michelle",
    "Lorine", "John", "Jedidah", "Anthony", "Maulid",
            "Beatrice", "Bill", "Rufus" };
    static Random random = new Random();
    public static void main(String args[]) {
        int select = random.nextInt(names.length);
        System.out.println("The random name is:"+names[select]);
    }
}
