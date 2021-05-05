/*
Bill Generation
Tom went to a movie with his friends in a multiplex theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 
Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Tom has bought.

Sample Input 1:
Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5

Sample Output 1:
Bill Details
No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290
ENJOY THE SHOW!!!
*/

import java.io.*;
import java.util.Scanner;
class SnacksDetails
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int pizza,puffs,drinks,total;
        System.out.println("Enter the no of pizzas bought:");
        pizza=sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        puffs=sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        drinks=sc.nextInt();
        total=pizza*100+puffs*20+drinks*10;
        System.out.println("Bill Details\nNo of pizzas:"+pizza+"\nNo of puffs:"+puffs+"\nNo of cooldrinks:"+drinks+"\nTotal price="+total+"\nENJOY THE SHOW!!!");
    }
}