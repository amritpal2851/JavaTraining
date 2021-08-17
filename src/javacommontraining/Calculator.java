package javacommontraining;
import java.util.Scanner;

public class Calculator {
    private int var1, var2;
    Scanner sc=new Scanner(System.in);
    void setData()
    {
       System.out.println("Please enter the variable");
       var1=sc.nextInt();
       var2=sc.nextInt();

    }
    public int addition()
    {
        return var1+var2;
    }


}
