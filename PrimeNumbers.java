/*Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).
Note:
Input 1 should be lesser than Input 2. Both the inputs should be positive. 
Range must always be greater than zero.
If any of the condition mentioned above fails, then display "Provide valid input"
Use a minimum of one for loop and one while loop

Sample Input 1:
2
15
Sample Output 1:
2 3 5 7 11 13

Sample Input 2:
8
5
Sample Output 2:
Provide valid input*/

import java.io.*;
import java.util.*;
import java.util.Scanner;
class PrimeNumbers
{
    public static void main (String[] args) {
        int a,b,count;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b&&a>0&&b>0&&b-a>0)
        {
           for(int i=a;i<=b;i++)
            {
                count=0;
                for(int j=1;j<=i;j++)
                {
                    if(i%j==0)
                        count++;
                }
                if(count==2)
                {
                    System.out.println(""+i);
                }
            } 
        }
        else
        {
            System.out.println("Provide valid input");
        }
    }
}