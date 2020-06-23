public class returningArrayFromMethod {
    static int[] get() {
        return new int[] { 60, 80, 200 };
    }
    public static void main(String args[]) {
        int arr[] = get();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
