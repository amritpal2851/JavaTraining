package javacommontraining;
import java.io.*;

public class StringBufferExample {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Intelligent Person");
        //BufferedReader br=new BufferedReader()
        //sb.insert(11,"is unknown");
        sb.reverse();
        StringBuffer obj1=new StringBuffer("High Cost");
        int length=sb.length();
        obj1.replace(0,4,"Low");
        System.out.println(sb);
        System.out.println(obj1);
    }
}
