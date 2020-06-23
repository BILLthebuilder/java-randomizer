public class CopyArrayclone {
    public static void main(String args[]) {
        int oldArrays[] = { 40, 222, 3434, 24, 66, 999 };
        int newArray[] = oldArrays.clone();

        System.out.println("our old array");
        for (int i = 0; i < oldArrays.length; i++) {
            System.out.println(oldArrays[i] + " ");
        }

        System.out.println("Our new array");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]+ " ");
        }
    }
}
