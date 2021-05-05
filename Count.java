/*
Pass and Fail Count
Ram has passed in certain subjects and failed in a few. Write a program to count the no of subjects he passed in and the no of subjects he has failed in. Marks scored below 50 is considered as failed. If Ram has passed in all the subjects print "Ram passed in all subjects" and if failed print "Ram failed in all subjects".
Assume maximum size of array is 20,
Sample Input 1:
Enter the no of subjects:
6
60
70
80
90
45
49
Sample Output 1:
Ram passed in 4 subjects and failed in 2 subjects

Sample Input 2:
Enter the no of subjects:
0
Sample Output 2:
Invalid input range

Sample Input 3:
Enter the no of subjects:
-2
Sample Output 3:
Invalid input range
*/

import java.util.*;
class Count
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of subjects:");
        int num=sc.nextInt();
        if(num<=0){
            System.out.println("Invalid input range");
            System.exit(0);
        }
        int[] sub=new int[20];
        int pass_count=0,fail_count=0;
        for(int i=0;i<num;i++)
        {
            sub[i]=sc.nextInt();
            if(sub[i]>=50)
                pass_count++;
            else 
                fail_count++;
        }
        if(pass_count==num)
        {
            System.out.println("Ram passed in all subjects");
        }
        else if(fail_count==num)
        {
            System.out.println("Ram failed in all subjects");
        }
        else{
            System.out.println("Ram passed in "+pass_count+" subjects and failed in "+fail_count+" subjects");
        }
    }
}