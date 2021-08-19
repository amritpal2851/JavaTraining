package javacommontraining;


public class Calculator {

    public void addition(int var1, int var2)
    {
        System.out.println(var1+var2);
    }
   public void subtraction(int var1,int var2)
    {
        System.out.println(var1-var2);
    }
   public void division(int var1,int var2)
  {
      try{
          System.out.println(var1/var2);
      }
      catch(ArithmeticException e){
          System.out.println("Denominator cannot be zero, please again enter valid value again");
      }

      //System.out.println(var1/var2);
  }
  public void multiplication(int var1, int var2)
  {
      System.out.println(var1*var2);
  }
}
