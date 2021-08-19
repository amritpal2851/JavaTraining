package module3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        try{
        File file=new File("D:\\JavaTrainig\\myFile.txt");
        Scanner myReader= new Scanner(file);
        while(myReader.hasNextLine()){
            String fileData=myReader.nextLine();
            System.out.println(fileData);
        }
        myReader.close();
        } catch(FileNotFoundException exception){
            System.out.println("File not found: ");
        }
}}
