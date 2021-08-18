package javacommontriaining2;
class InterfacePractice implements Printer{
  @Override
    public void getString(String text)
    {
        System.out.println("Please enter what you learn: ");
        System.out.println(text);

    }

    public static void main(String []args)
    {
       InterfacePractice obj1= new InterfacePractice();
       String line1="Hello World";
       obj1.getString(line1);
    }

}
