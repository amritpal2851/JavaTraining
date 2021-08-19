package module3;
import java.io.File;
import java.io.IOException;

public class Create {
    public static void main(String[] args) {
    {
        try{
            File create=new File("myFile.txt");
            if(create.createNewFile()){
                System.out.println("File created successfully: Name of new file ");
            }
            else{
                System.out.println("File already exited ");
                System.out.println(create.getAbsoluteFile());
            }
        }
        catch(IOException e){
            System.out.println("Error occur");
        }

    }
}}
