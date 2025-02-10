package prelim;

import java.util.Scanner;

public class arithmetic_operators {

//    Methods
    public static int addition( int x, int y){
        return x+y;
    }
   
    
    public static void main(String[] args) {

        int x;
        int y;
      Scanner in = new Scanner(System.in);
      
      System.out.println(" Enter first number: ");
      x = in.nextInt();
      System.out.println(" Enter second number: ");
      y = in.nextInt();
    
//      Calling methods to execute the addition method
      int result = addition(x, y);

      
      
        System.out.println("\n"+ x + " + " + y + " = " + result);
        
        
        
        
        
        
//        System.out.println(x + " - " + y + " = " + (x - y));
//        System.out.println(x + " X " + y + " = " + (x * y));
//        System.out.println(x + " / " + y + " = " + (x / y));
//        System.out.println(x + " mod " + y + " = " + (x % y));

    }

}
