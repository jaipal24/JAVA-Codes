/*
Validate PAN
Write a program to check  the  PAN card no is valid or not. Generally a PAN no is a mix of both numbers and alphabets. It should have exactly 10 characters, in which, the first 5 characters should be upper case, the next 4 should be numbers, and last one should be an upper case character. If the PAN no doesn't match the pattern print "Invalid PAN no".

Sample Input 1:
Enter the PAN no:
ASDFG7896K

Sample Output 1:
Valid PAN no

Sample Input 2:
Enter the PAN no:
7896ABC8K

Sample Output 2:
Invalid PAN no
*/

import java.util.*;
//import org.apache.commons.lang3.StringUtils;
class PanCard
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the PAN no:");
        String str=sc.nextLine();
        if(str.length()!=10)
        {
            System.out.println("Invalid PAN no");
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
                    System.out.println("Invalid PAN no");
                    System.exit(0);
                }
            }
            else if(i!=str.length()-1)
            {
                if(Character.isDigit(str.charAt(i)))
                    continue;
                else{
                    System.out.println("Invalid PAN no");
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
                    System.out.println("Invalid PAN no");
                    System.exit(0);
                }
            }
        }
        System.out.println("Valid PAN no");
    }
}