/*
Number Palindrome
George and  Tintin plays  by  telling numbers.  George says a number to Tintin.  Tintin should first reverse the number and check if it is same as the original.  If yes,  Tintin should say “Palindrome”.  If not, he should say “Not a Palindrome”.  If the number is negative, print “Invalid Input”.  Help Tintin by writing a program.

Sample Input 1 :
21212
Sample Output 1 :
Palindrome

Sample Input 2 :
6186
Sample Output 2 :
Not a Palindrome
*/

import java.io.*;
import java.util.*;
class Palindrome
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int temp=num,rev=0,rem;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(num==rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}