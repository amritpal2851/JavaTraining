package module3.filehandlingwithbuffer;
import java.io.File;
import java.io.IOException;

public class Create2 {
    public static void main(String[] args) {
        try
        {
            File create= new File("Amrit.txt");
            if(create.createNewFile()){
                System.out.println("New file is created successfully ");
            }
            else{
                System.out.println("File cannot be created some error is occured: ");
                System.out.println(create.getAbsoluteFile());
                System.out.println(create.getName());
            }
        }
        catch(IOException ex){
            System.out.println("IOException: ");
        }
    }
}
