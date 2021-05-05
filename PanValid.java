/*
PAN Card Validation

Develop an application to validate the PAN number of a person using regular expression.
Create a class UserMain and do the I/O operations. Refer the samples given, to read the data and display the output.
PAN Number should have exactly ten characters.  First 5 characters should be alphabets in upper case, next four characters should be digits from 0 to 9 and the last character should be an alphabet in capital case.

Sample Input 1:
Enter your PAN number
SSTHP1234L

Sample Output 1:
Valid PAN number

Sample Input 2:
Enter your PAN number 
GBSPL78945

Sample Output 2:
Invalid PAN number
*/

import java.util.*;
//import org.apache.commons.lang3.StringUtils;
class PanValid
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your PAN number:");
        String str=sc.nextLine();
        if(str.length()!=10)
        {
            System.out.println("Invalid PAN number");
            System.exit(0);
        }
        for(int i=0;i<str.length();i++)
        {
            if(i<5)
            {
                if(Character.isAlphabetic(str.charAt(i))&&Character.isUpperCase(str.charAt(i)))
                {
                    continue;
                }
                else{
                    System.out.println("Invalid PAN number");
                    System.exit(0);
                }
            }
            else if(i!=str.length()-1)
            {
                if(Character.isDigit(str.charAt(i)))
                    continue;
                else{
                    System.out.println("Invalid PAN number");
                    System.exit(0);
                }
            }
            if(i==str.length()-1)
            {
                if(Character.isAlphabetic(str.charAt(i))&&Character.isUpperCase(str.charAt(i)))
                {
                    continue;
                }
                else{
                    System.out.println("Invalid PAN number");
                    System.exit(0);
                }
            }
        }
        System.out.println("Valid PAN number");
    }
}