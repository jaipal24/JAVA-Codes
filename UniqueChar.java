/*
Print unique characters
Write a program to print all the unique characters in a given sentence. 
The sentence should have only alphabets .
If the sentence is not valid display the message "Invalid Sentence".
If unique characters are not found print "No unique characters".
If unique characters are found print those characters as shown in sample output.

Sample Input 1:
Enter the sentence:
java is an object oriented programming language

Sample Output 1:
Unique characters:
v
s
b
c
d
p
l
u

Sample Input 2:
Welcome to 12house

Sample Output 2:
Invalid Sentence
*/

import java.util.*;
class UniqueChar
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str=sc.nextLine();
        if(!checkForChar(str))
        {
            System.out.println("Invalid Sentence");
            System.exit(0);
        }
        boolean flag;
        int count=0,k=0;
        char[] ch=new char[100];
        for(int i=0;i<str.length();i++)
        {
            flag=true;
            for(int j=0;j<str.length();j++)
            {
                if(i!=j)
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        flag=false;
                        break;
                    }
                }
            }
            if(flag)
            {
                ch[k++]=str.charAt(i);
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("No unique characters");
        }
        else{
            System.out.println("Unique characters:");
            for(int i=0;i<k;i++)
                System.out.println(ch[i]);
        }
    }
     private static boolean checkForChar(String str)
     {
         for(int i=0;i<str.length();i++)
         {
             if(Character.isAlphabetic(str.charAt(i))||str.charAt(i)==' ')
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