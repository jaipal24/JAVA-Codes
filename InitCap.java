/*
InitCap

Write a program to convert the first character of each word in a sentence to uppercase.
If the first character of each word in the given sentence is already in upper case, then print "First character of each word is already in uppercase".

Sample Input 1: 
Enter the String:
Work hard to get what you like

Sample Output 1:
Work Hard To Get What You Like

Sample Input 2:
Enter the String:
Work Hard To Get What You Like

Sample Output 2:
First character of each word is already in uppercase

*/

import java.util.*;
class InitCap
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        String[] str_arr=str.split(" ");
        int count=0;
        for(int i=0;i<str_arr.length;i++)
        {
            if(Character.isUpperCase(str_arr[i].charAt(0)))
            {
                count++;
            }
            else{
                 str_arr[i] = str_arr[i].replace(str_arr[i].charAt(0), Character.toUpperCase(str_arr[i].charAt(0)));
            }
        }
        if(count==str_arr.length)
        {
            System.out.println("First character of each word is already in uppercase");
        }
        else{
            for(int i=0;i<str_arr.length;i++)
            {
                System.out.print(str_arr[i]+" ");
            }
        }
    }
}