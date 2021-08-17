package javacommontriaining2;
import javacommontraining.Calculator;
import java.util.Scanner;


public class Person {
    public static void main(String []args) {
        Calculator obj1 = new Calculator();
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter first variable: ");
        obj1.setVar1(sc.nextInt());
        System.out.println("Please enter your second variable: ");
        obj1.setVar2(sc.nextInt());
        int result=obj1.addition();
        System.out.println(result);
    }
}
