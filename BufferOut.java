import java.io.*;
public class BufferOut {
    public static void main(String args[]) {
        String myContent = "Buffer content";
        try {
            String filepath = "C:\\Users\\bkariri\\Documents\\projects\\java-randomizer\\";
            File mylocation = new File(filepath + "example.txt");
            FileOutputStream myFile = new FileOutputStream(mylocation);
            BufferedOutputStream buffer = new BufferedOutputStream(myFile);
            if (mylocation.exists()) {
                byte[] bytesArray = myContent.getBytes();

                buffer.write(bytesArray);
                buffer.flush();
                //myFile.close();
                System.out.println("We have added data to our file now");
            } else {
                mylocation.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("There is a problem with your file path");
        }
    }
}
