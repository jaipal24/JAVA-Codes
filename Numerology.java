/*
Numerology

Write a program to find the numerological value for a given name.
Note: Store the numerological number and the corresponding character in a 2-D array(2*26). Always the given  name should be in capital case ,else the name is not valid. Check for the valid name,if the name is invalid print the message "Invalid name".There should not be any space in the name provided.
For example:
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
1 2 3 4 5 8 3 5 1 1 2 3 4 5 7 8 1 2 3 4 6 6 6 5 1 7

Sample Input 1:
Enter your name:
SUDHA

Sample Output 1:
Your numerology no is:19

Sample Input 2:
Enter your name:
kiran

Sample Output 2:
Invalid name

Sample Input 3:
Enter your name:
ANI34

Sample Output 3:
Invalid name
*/

import java.util.*;
class Numerology
{
   public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       char[] row0={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
       char[] row1={'1','2','3','4','5','8','3','5','1','1','2','3','4','5','7','8','1','2','3','4','6','6','6','5','1','7'};
       char[][] ch_arr={row0,row1};
       System.out.println("Enter your name:");
       String str=sc.nextLine();
       int sum=0;
       //System.out.println(""+Character.getNumericValue(ch_arr[1][3]));
       if(checkForChar(str))
       {
           for(int i=0;i<str.length();i++)
           {
               for(int j=0;j<26;j++)
               {
                   if(str.charAt(i)==ch_arr[0][j])
                   {
                       sum+=Character.getNumericValue(ch_arr[1][j]);
                   }
               }
           }
           System.out.println("Your numerology no is:"+sum);
       }
       else{
           System.out.println("Invalid name");
       }
   } 
   private static boolean checkForChar(String str)
    {
         for(int i=0;i<str.length();i++)
         {
             if(Character.isAlphabetic(str.charAt(i))&&Character.isUpperCase(str.charAt(i)))
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