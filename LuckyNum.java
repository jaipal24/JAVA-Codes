/*
Lucky Number
William planned to choose a four digit lucky number for his car. His lucky numbers are 3,5 and 7. Help him find the number, whose sum is divisible by  3 or 5 or 7.
Provide a valid car number, Fails to provide a valid input then display that number is not a valid car number. 
Note : The input other than 4 digit positive number[includes negative and 0] is considered as invalid.
Refer the samples, to read and display the data.

Sample Input 1:
Enter the car no:1234
Sample Output 1:
Lucky Number

Sample Input 2:
Enter the car no:1214
Sample Output 2:
Sorry its not my lucky number

Sample Input 3:
Enter the car no:14
Sample Output 3:
14 is not a valid car number
*/

import java.io.*;
import java.util.*;
class LuckyNum
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the car no:");
        int num=sc.nextInt();
        int sum=0,rem,temp;
        if(validNumber(num))
        {
            temp=num;
            while(temp!=0)
            {
                rem=temp%10;
                sum+=rem;
                temp=temp/10;
            }
            if(sum%3==0||sum%5==0||sum%7==0)
            {
                System.out.println("Lucky Number");
            }
            else
                System.out.println("Sorry its not my lucky number");
        }
        else{
            System.out.println(num+" is not a valid car number");
        }
    }
    private static boolean validNumber(int num)
    {
        if(num<=0)
            return false;
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        if(count==4)
            return true;
        else
            return false;
    }
}