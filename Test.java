/*
Find Average Age
One of the least Insurance agencies recruited employees for their collection department. Now the HR needs a report as the average age of all the employees working in that department. Write a code to calculate the average age.
Implement a method "calculateAverage(int[] age)" to calculate the average age and return the result to the caller function. 
Note : 
Age limit should be minimum of 28 years and maximum of 40 years. 
Minimum of 2 employees is mandatory to calculate average age, if fails, the output should be "Please enter a valid employee count"
If any of the age is invalid, terminate the process and display "Invalid age encountered!"
Refer the sample given for read and display the output.

Sample Input 1:
Enter total no.of employees:
3
Enter the age for 3 employees:
30
31
32

Sample Output 1:
The average age is 31.00

Sample Input 2:
Enter total no.of employees:
2
Enter the age for 2 employees:
29
36
Sample Output 2:
The average age is 32.50

Sample Input 3:
Enter total no.of employees:
1

Sample Output 3:
Please enter a valid employee count
*/

import java.util.*;
class Test
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total no.of employees:");
        int num=sc.nextInt();
        sc.nextLine();
        if(num<2)
        {
            System.out.println("Please enter a valid employee count");
            System.exit(0);
        }
        System.out.println("Enter the age for "+num+" employees:");
        int[] ages=new int[num];
        for(int i=0;i<num;i++)
        {
            ages[i]=sc.nextInt();
            if(ages[i]<28||ages[i]>40)
            {
                System.out.println("Invalid age encountered!");
                System.exit(0);
            }
        }
        double res=calculateAverage(ages);
        System.out.printf("The average age is %.2f",res);
    }
    public static double calculateAverage(int[] ages)
    {
        double sum=0;
        for(int i=0;i<ages.length;i++)
        {
            sum+=ages[i];
        }
        return (sum/ages.length);
    }
}