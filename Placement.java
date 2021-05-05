/*
Highest Placement
SRV college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot
Note : If any input is negative, the output should be "Input is Invalid".  If all department has equal number of placements, the output should be "None of the department has got the highest placement".
Sample Input 1:
Enter the no of students placed in CSE:90
Enter the no of students placed in ECE:45
Enter the no of students placed in MECH:70
Sample Output 1:
Highest placement
CSE

Sample Input 2:
Enter the no of students placed in CSE:55
Enter the no of students placed in ECE:85
Enter the no of students placed in MECH:85
Sample Output 2:
Highest placement
ECE
MECH

Sample Input 3:
Enter the no of students placed in CSE:0
Enter the no of students placed in ECE:0
Enter the no of students placed in MECH:0
Sample Output 3:
None of the department has got the highest placement

Sample Input 4:
Enter the no of students placed in CSE:10
Enter the no of students placed in ECE:-50
Enter the no of students placed in MECH:40
Sample Output 3:
Input is Invalid 
*/

import java.io.*;
import java.util.Scanner;
class Placement
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int cse,ece,mech;
        System.out.println("Enter the no of students placed in CSE:");
        cse=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the no of students placed in ECE:");
        ece=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the no of students placed in MECH:");
        mech=sc.nextInt();
        sc.nextLine();
        if(cse==ece&&ece==mech)
        {
            System.out.println("None of the department has got the highest placement");
        }
        else if(cse<0||ece<0||mech<0)
        {
            System.out.println("Input is Invalid");
        }
        else if(cse==ece&&ece>mech)
        {
            System.out.println("Highest placement\nCSE\nECE");
        }else if(cse>ece&&cse==mech)
        {
            System.out.println("Highest placement\nCSE\nMECH");
        }
        else if(cse<ece&&ece==mech)
        {
            System.out.println("Highest placement\nECE\nMECH");
        }
        else if(cse>ece&&cse>mech)
        {
            System.out.println("Highest placement\nCSE");
        }
        else if(cse<ece&&ece>mech)
        {
            System.out.println("Highest placement\nECE");
        }
        else if(cse<mech&&ece<mech)
        {
            System.out.println("Highest placement\nMECH");
        }
    }
}