package javacommontraining;
import java.util.Scanner;
public class CalculatorUser {
    public static void main(String[] args) {
        System.out.println("Hello, I made calculation easy: ");
        while(true){
        Scanner sc=new Scanner(System.in);
        System.out.println("Which operation you want to do ?");
        System.out.println("1-> Addition\n2-> Subtraction\n3-> Division\n4-> Multiplication\n5->Exit");
        int optionVariable=sc.nextInt();
        try{
            //int optionVariable2=optionVariable;
            if (optionVariable<0 || optionVariable>5){
            throw new WrongOptionException("Hello world");
            }

        }
        catch(WrongOptionException ex)
        {
            System.out.println("Wrong option is chosen\nPlease chose again");
            continue;
        }
      //  int optionVariable=sc.nextInt();
        //Check chosen option is right or not
//        if(optionVariable<=0 || optionVariable>4)
//            System.out.println("*********NOT VALID OPTION***********\nPlease Choose Option again :) ");
      //  else
        Calculator obj1=new Calculator();
        System.out.println("Enter first value: ");
        int number1=sc.nextInt();
        System.out.println("Enter second value: ");
        int number2=sc.nextInt();
        //Method Selection from class Calculator
        switch (optionVariable) {
            case 1 -> obj1.addition(number1, number2);
            case 2 -> obj1.subtraction(number1, number2);
            case 3 -> obj1.division(number1, number2);
            case 4 -> obj1.multiplication(number1, number2);
            case 5 -> obj1.end();
         //   default -> {throw new IllegalStateException("Unexpected value: " + optionVariable);}
        }
       break;}}
}
