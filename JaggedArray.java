public class JaggedArray {
    public static void main(String args[]) {
        int myArray[][] = new int[4][];
        myArray[0] = new int[4];
        myArray[1] = new int[6];
        myArray[2] = new int[1];
        myArray[3] = new int[8];
         
        int count = 0;

        for (int i = 0; i < myArray.length; i++) {
            for (int x = 0; x < myArray[i].length; x++) {
                myArray[i][x] = count++;
            }
        }
        
        for(int y = 0; y < myArray.length; y++){
            for (int w = 0; w < myArray[y].length; w++) {

                System.out.println(myArray[y][w] + "\t");
            }
            System.out.println();
            System.out.println(count);
        }
    }
}
