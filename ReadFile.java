import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String args[]) {
        String filepath = "C:\\Users\\bkariri\\Documents\\projects\\java-randomizer\\";
        File myLocation = new File(filepath + "example.txt");
        try {
            Scanner read = new Scanner(myLocation);
            while (read.hasNextLine()) {
                String content = read.nextLine();
                System.out.println("Our content from the file is:");
                System.out.println(content);
               //read.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot read anything from your file");
        }
    }
}
