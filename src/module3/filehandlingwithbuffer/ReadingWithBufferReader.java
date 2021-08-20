package module3.filehandlingwithbuffer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
public class ReadingWithBufferReader {
    public static void main(String[] args) {
    File file=new File("D:\\JavaTrainig\\myFile.txt");
    try{
        BufferedReader br=new BufferedReader(new FileReader(file));
        String content;
        while((content=br.readLine())!=null){
            System.out.println(content);
        }

    }
    catch(IOException ex){
        System.out.println("Error Occurred during reading");
        ex.printStackTrace();
    }
    }
}
