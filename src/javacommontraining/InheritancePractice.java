package javacommontraining;
import java.util.Scanner;
class Officer {
    private String name;
    private int EmpID;
    private String city;
    public void setData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your name :");
        name=sc.nextLine();
        System.out.println("Pleas enter your employ ID: ");
        EmpID=sc.nextInt();
        System.out.println("Please enter your city");
        city=sc.nextLine();
    }
    public void display()
    {
        System.out.println("Name of Employ is "+ name);
        System.out.println("The employ Id is "+EmpID);
        System.out.println("Name of the Employ's city is:"+city);
    }
}
public class InheritancePractice extends Officer
{
    public static void main(String[] args)
    {
        Officer Obj1= new Officer();
        InheritancePractice Obj2= new InheritancePractice();
        Obj2.setData();
        Obj2.display();
    }
}
