/*
Palindrome
Astrologist believes that having a palindromic name is very auspicious . As we all know, a palindrome is a word that can be read the same way in either direction.There should not be a space or any special character in the word entered. If yes, display "Invalid Input". Write a Java program to determine whether a given word is a palindrome or not.
Sample Input 1:
Enter the word : 
Malayalam

Sample Output 1: 
Malayalam is a Palindrome

Sample Input 2:
Enter the word : 
Apple

Sample Output 2: 
Apple is not a Palindrome

Sample Input 3:
Enter the word :
no on

Sample Output 3: 
Invalid Input

Sample Input 4:
Enter the word :
@nnn

Sample Output 4: 
Invalid Input
*/

import java.util.*;
class Palindrome
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word :");
        String str=sc.nextLine();
        if(!checkForChar(str))
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else{
            str=str.toLowerCase();
            int j=str.length()-1;
            for(int i=0;i<str.length();i++,j--)
            {
                if(i<=j)
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        continue;
                    }
                    else
                    {
                        System.out.println(str+" is not a Palindrome");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(str+" is a Palindrome");
    }
    private static boolean checkForChar(String str)
     {
         for(int i=0;i<str.length();i++)
         {
             if(Character.isAlphabetic(str.charAt(i)))
             {
                 continue;
             }
             else
                {
                    return false;
                }
         }
         return true;
     }
}