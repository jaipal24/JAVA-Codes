/*
String - Find and replace the character (First occurrence)
Write a Java program to find a character from a sentence and replace it with another character. If the character is not found in the string print "character not found".
Note: Replace only the first occurrence.

Sample input 1:
Enter the string:
java programming
Enter the character to be searched:
a
Enter the character to replace:
o
Sample output 1:
jova programming

Sample input 2:
Enter the string:
java programming

Enter the character to be searched:
e
Enter the character to replace:
o

Sample output 2:
character not found
*/

import java.util.*;
class FirstOccurence
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        System.out.println("Enter the character to be searched:");
        char ch1=sc.next().charAt(0);
        System.out.println("Enter the character to replace:");
        char ch2=sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch1)
            {
                str = str.substring(0, i) + ch2 + str.substring(i + 1);
                System.out.println(str);
                System.exit(0);
            }
        }
        System.out.println("character not found");
    }
}