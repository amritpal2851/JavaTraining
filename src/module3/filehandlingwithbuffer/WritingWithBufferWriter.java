package module3.filehandlingwithbuffer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class WritingWithBufferWriter {
    public static void main(String[] args) {
        File file=new File("D:\\JavaTrainig\\myFile.txt");
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter(file));
            writer.write("Hello World!");
            System.out.println("Ok Done!");
            writer.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error");
            ex.printStackTrace();
        }
    }

}
