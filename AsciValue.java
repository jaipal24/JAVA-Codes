/*
Display Characters
Rohan wants a magic board, which displays a character for a corresponding number for his science exhibition. Help him to develop such application. 
For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
[Assume the number of inputs should be always 4 ]
Sample Input 1:
Enter the digits:
65
66
67
68

Sample Output 1:
65-A
66-B
67-C
68-D

Sample Input 2: 
Enter the digits:
115
116
101
112

Sample Output 2:
115-s
116-t
101-e
112-p
*/

import java.io.*;
import java.util.Scanner;
class AsciValue
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter the digits:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        System.out.println(a+"-"+(char)a+"\n"+b+"-"+(char)b+"\n"+c+"-"+(char)c+"\n"+d+"-"+(char)d);
    }
}