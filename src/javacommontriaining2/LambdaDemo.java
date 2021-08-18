package javacommontriaining2;
import java.util.Scanner;
abstract class LambdaDemo implements Printer{

    public static void main(String []args)
    {
        System.out.println("Please Write something : ");
        Scanner sc=new Scanner(System.in);
        String line1=sc.nextLine();
        Printer ref1=(text) -> System.out.println(text);
        ref1.getString(line1);
    }
}
