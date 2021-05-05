/*
Check Number Type
Create a public functional interface NumberType with  a method :
              public boolean checkNumberType(int number)
Create a public class NumberTypeUtility with the below method :
     public static NumberType isOdd() – The lambda expression  for the checkNumberType  method must return true if the number passed as parameter is odd, else return false. 
Don’t create object for NumberType. Use lambda expression.
Write the main method in NumberTypeUtility  class.
             Get the value for a number.
             Invoke the isOdd method
             Capture the object of NumberType returned by the static method.
             Invoke the checkNumberType method for the number got as input  from the user.
             Display the result as shown in sample output.
Sample Input 1 :
58
Sample Output 1 :
58 is not odd
Sample Input 2 :
77
Sample Output 2 :
77 is odd
*/

public interface NumberType
{
    public boolean checkNumberType(int number);
}

import java.io.*;
import java.util.*;
public class NumberTypeUtility
{
  public static void main (String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      NumberTypeUtility obj =new NumberTypeUtility();
      NumberType NT =obj.isOdd();
      boolean b = NT.checkNumberType(num);
      if(b)
      {
          System.out.println(num+" is odd");
      }
      else  
        System.out.println(num+" is not odd");
  }
  
  public static NumberType isOdd() 
  {
      return (int a) -> a % 2 != 0;
  }
}