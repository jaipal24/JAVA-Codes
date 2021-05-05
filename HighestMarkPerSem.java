/*
Highest Mark in Each Semester
Ram wants to know the maximum marks scored by him in each semester. The mark should be between 0 to 100 ,if goes beyond the range display "You have entered invalid mark."
Sample Input 1:
Enter no of semester:
3
Enter no of subjects in 1 semester:
3
Enter no of subjects in 2 semester:
4
Enter no of subjects in 3 semester:
2
Marks obtained in semester 1:
50
60
70
Marks obtained in semester 2:
90
98
76
67
Marks obtained in semester 3:
89
76

Sample Output 1:
Maximum mark in 1 semester:70
Maximum mark in 2 semester:98
Maximum mark in 3 semester:89

Sample Input 2:
Enter no of semester:
3
Enter no of subjects in 1 semester:
3
Enter no of subjects in 2 semester:
4
Enter no of subjects in 3 semester:
2
Marks obtained in semester 1:
55
67
98
Marks obtained in semester 2:
67
-98

Sample Output 2:
You have entered invalid mark.
*/

import java.util.*;
class HighestMarkPerSem
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int no_of_sem;
        System.out.println("Enter no of semester:");
        no_of_sem=sc.nextInt();
        sc.nextLine();
        int[] no_of_subj=new int[no_of_sem+1];
        for(int i=1;i<=no_of_sem;i++)
        {
            System.out.println("Enter no of subjects in "+i+" semester:");
            no_of_subj[i]=sc.nextInt();
        }
        int[][] marks=new int[no_of_sem+1][10];
        for(int i=1;i<=no_of_sem;i++)
        {
            System.out.println("Marks obtained in semester "+i+":");
            for(int j=1;j<=no_of_subj[i];j++)
            {
                marks[i][j]=sc.nextInt();
                if(marks[i][j]<0||marks[i][j]>100)
                {
                    System.out.println("You have entered invalid mark.");
                    System.exit(0);
                }
            }
        }
        for(int i=1;i<=no_of_sem;i++)
        {
            int max=-1;
            System.out.print("Maximum mark in "+i+" semester:");
            for(int j=1;j<=no_of_subj[i];j++)
            {
                //System.out.println(""+marks[i][j]);
                if(marks[i][j]>=max)
                {
                    max=marks[i][j];
                }
            }
            System.out.print(""+max+"\n");
        }
    }
}