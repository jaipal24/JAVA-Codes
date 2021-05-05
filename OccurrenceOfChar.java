/*
Count occurrence of a character
Raji wants to count the no of occurrences of the given character.Write a program to accept a word from the user. Get a character from the user and find the no of occurrences . 
Check whether the given character and word is valid
The word is valid if it contains only alphabets and no space or any special characters or numbers.
The character is valid if it is an alphabet alone.

Sample Input 1:
Enter a word:
programming
Enter the character:
m

Sample Output 1:
No of 'm' present in the given word is 2.

Sample Input 2:
Enter a word:
programming
Enter the character:
s

Sample Output 2:
The given character 's' not present in the given word.

Sample Input 3:
Enter a word:
56

Sample Output 3:
Not a valid string

Sample Input 4:
Enter a word:
Hello
Enter the character:
6

Sample Output 4:
Given character is not an alphabet
*/

 import java.util.*;
 class OccurrenceOfChar
 {
     public static void main (String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a word:");
         String str=sc.nextLine();
         if(!checkForChar(str))
         {
             System.out.println("Not a valid string");
             System.exit(0);
         }
         System.out.println("Enter the character:");
         char ch=sc.next().charAt(0);
         if(!Character.isAlphabetic(ch))
         {
             System.out.println("Given character is not an alphabet");
             System.exit(0);
         }
         int count=0;
         for (int i = 0; i < str.length(); i++) 
         {
            if (ch == str.charAt(i)) {
                count++;
            }
         }
         if(count==0)
         {
             System.out.println("The given character \'"+ch+"\' not present in the given word.");
         }
         else
            System.out.println("No of \'"+ch+"\' present in the given word is "+count+".");
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
 