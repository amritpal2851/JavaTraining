package javacommontraining;

public class Implementation {
    public static void main(String[] args)
    {
        Calculator obj=new Calculator();
        obj.setData();
        int answer =obj.addition();
        System.out.println(answer);
    }
}
