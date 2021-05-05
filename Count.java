/*
Pencil Count
Nila uses pencils to write at school and at home. When she was in her 1st standard, her parents bought her one pencil. In her 2nd standard, she needed 5 pencils, and in 3rd standard, she needed 14 pencils and so on. How many pencils does she get from the provided standard?
Note : If the input given is not between 1 to 12  then the output should be "Invalid Standard"

Sample Input 1:
Enter the standard: 4
Sample Output 1:
Nila gets 30 pencils

Sample Input 2:
Enter the standard: 5
Sample Output 2:
Nila gets 55 pencils

Sample Input 3:
Enter the standard:14
Sample Output 3:
Invalid Standard
*/

import java.io.*;
import java.util.*;
class Count
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the standard:");
        int std=sc.nextInt();
        if(std<1||std>12)
        {
            System.out.println("Invalid Standard");
            System.exit(0);
        }
        else{
            System.out.println("Nila gets "+(std*std+prev(std-1))+" pencils");
        }
    }
    private static int prev(int std)
    {
        if(std>0)
            return std*std+prev(std-1);
        return 0;
    }
}