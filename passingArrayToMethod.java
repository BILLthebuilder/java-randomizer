public class passingArrayToMethod {
    public static void main(String args[]) {
        int[] numbers = { 10, 22, 40, 90 };
        System.out.println("'Array before passing it to a method");
        System.out.println("numbers[0]="+numbers[0]+"\n numbers[1]="+numbers[1]+"\n numbers[2]="+numbers[2]
                + "\n numbers[3]=" + numbers[3]);
        System.out.println("Array after passing it to a method");
        changeArray(numbers);
        System.out.println("numbers[0]=" + numbers[0] + "\n numbers[1]=" + numbers[1] + "\n numbers[2]=" + numbers[2]
                + "\n numbers[3]=" + numbers[3]);
    }

    private static void changeArray(int[] passedValue) {
        passedValue[0] = 0;
        passedValue[1] = 100;
        passedValue[2] = 99;
        passedValue[3] = 888;
    }
}
