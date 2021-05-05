/*
Validate Name
Create a public functional interface Validate with  a method :
public boolean validateName(String name);
Create a public class ValidateUtility with the below methods :
public static Validate validateEmployeeName() – The lambda expression  for the validateName  method must return true if the name is valid and return false if the name is invalid. 
In this case, the name is valid if it contains alphabets and space and it should contain minimum 5 characters and maximum 20 characters.
public static Validate validateProductName() – The lambda expression  for the validateName  method must return true if the name is valid and return false if the name is invalid. 
In this case, the name is valid if the first character is an alphabet followed by 5 digits.
Write the main method in ValidateUtility  class.
             -  Get the value for employee name and product name. 
             -  Invoke the validateEmployeeName method
             -  Capture the object of Validate returned by the static method.
             -  Invoke the validateName method for the employee name received as input  from the user.
             -  Display the result as shown in sample output. 
             -  Next, invoke the validateProductName method
             -  Capture the object of Validate returned by the static method.
             -  Invoke the validateName method for the product name received as input  from the user.
             -  Display the result as shown in sample output. 
Note  :  Implement all the static methods mentioned above using lambda expression.  Don’t create object for the interface using new keyword.
Sample Input 1 :
Pinky Rose
A8546
Sample Output 1 :
Employee name is valid
Product name is invalid

Sample Input 2 :
Rahul@123
X82456
Sample Output 2 :
Employee name is invalid
Product name is valid
*/

public interface Validate{
    //write the abstract method 
    public boolean validateName(String name);
}

import java.util.*;
 public class ValidateUtility
 {
     public static void main(String args[])
     {
         //fill code here
         Scanner sc=new Scanner(System.in);
         String cname=sc.nextLine();
       String pname=sc.nextLine();
         ValidateUtility vu=new ValidateUtility();
         Validate v1=vu.validateEmployeeName();
         boolean b=v1.validateName(cname);
         if(b)
         {
             System.out.println("Employee name is valid");
         }
         else
         {
             System.out.println("Employee name is invalid");
         }
         Validate v2=vu.validateProductName();
         b=v2.validateName(pname);
         if(b)
             System.out.println("Product name is valid");
         else
             System.out.println("Product name is invalid");
         
         
     }
     
     public static Validate validateEmployeeName() 
     {
       Validate v1=(str)->str.matches("[A-Za-z\\s]{5,20}$");
       return v1;
 
     }
     
     public static Validate validateProductName() 
     {
         Validate v2=(str)->str.matches("^[A-Za-z][0-9]{5}$");
         return v2;
         
     }
 }