import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String args[]) {
        String myContent = "ghgijjgrgjheigheguzszszszszszszszszszszsigiehgieshgiewks";
        try {
            String filepath = "C:\\Users\\bkariri\\Documents\\projects\\java-randomizer\\";
            File mylocation = new File(filepath + "example.txt");
            FileOutputStream myFile = new FileOutputStream(mylocation);
            if (mylocation.exists()) {
                byte[] bytesArray = myContent.getBytes();

                myFile.write(bytesArray);
                myFile.flush();
                myFile.close();
                System.out.println("We have added data to our file now");
            } else {
                mylocation.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("There is a problem with your file path");
        }
    }
}
