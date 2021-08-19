package module3;
import java.io.File;

public class Delete {
    public static void main(String[] args) {
        File file=new File("D:\\JavaTrainig\\NewFile.txt");
        if(file.delete()){
            System.out.println("File is deleted ");
        }
        else{
            System.out.println("some occurd during deletion of file :( ");
        }


    }

}
