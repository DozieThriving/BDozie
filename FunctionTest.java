import java.util.Scanner;	

    public class FunctionTest {
	  public static void main( String[] arg) {
   
     Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first number:");  
      int num1 = input.nextInt();
  
    System.out.print("Enter second number:");  
      int num2 = input.nextInt();

   int result = Function.subtract(num1, num2);
      System.out.println("The difference is :" + result);


}

}