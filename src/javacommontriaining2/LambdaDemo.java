package javacommontriaining2;
import java.util.Scanner;
class LambdaDemo {

    public static void main(String []args)
    {
        System.out.println("Please Write your first name : ");
        Scanner sc=new Scanner(System.in);
        String line1=sc.nextLine();
        System.out.println("Please Write something : ");
        String line2=sc.nextLine();

        Printer ref1=(var1,var2) -> {System.out.println("Hello "+var1);
            System.out.println("Hello "+ var2);};
        ref1.getString(line1,line2);

    }
}
