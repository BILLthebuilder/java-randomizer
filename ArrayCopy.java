public class ArrayCopy {
    public static void main(String args[]) {
        char[] original = { 'L', 'R', 'Q', 'A', 'C', 'K' };

        char[] receiverArray = new char[5];

        System.arraycopy(original, 0, receiverArray, 0, 4);

        System.out.println(String.valueOf(receiverArray));
    }
}
