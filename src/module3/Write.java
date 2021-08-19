package module3;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Write {
    public static void main(String []args){
        try{
            File file=new File("D:\\JavaTrainig\\myFile.txt");
            FileWriter write= new FileWriter(file,true);
            write.write("Hello my name is Amritpal Singh, I am practicing java from Scratch 3:)");
            write.close();
            System.out.println("File written successfully ");
        }
        catch(IOException e){
            System.out.println("There is some problem with file, try again");
        }
    }
}
