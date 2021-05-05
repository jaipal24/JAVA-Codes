/*
Movie Ticket Calculation
In a multiplex theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme. The cost of the king class ticket is Rs.75 and queen class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.
Hint: k-king and q-queen and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display "Minimum of 5 and Maximum of 40 Tickets".  If circle is given a value other than 'k' or 'q' the output should be "Invalid Input".
The ticket cost should be printed exactly to two decimal places.

Sample Input 1:
Enter the no of ticket:35
Do you want refreshment:y
Do you have coupon code:y
Enter the circle:k

Sample Output 1:
Ticket cost:4065.25

Sample Input 2:
Enter the no of ticket:1
Sample Output 2:
Minimum of 5 and Maximum of 40 Tickets
*/

import java.io.*;
import java.util.*;
class CinemaTicket
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int ticket;
        double total=0.0,dis=0.0;
        char ref,cop,cir;
        System.out.println("Enter the no of ticket:");
        ticket=sc.nextInt();
        if(ticket<5||ticket>40)
        {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            System.exit(0);
        }
        System.out.println("Do you want refreshment:");
        ref=sc.next().charAt(0);
        System.out.println("Do you have coupon code:");
        cop=sc.next().charAt(0);
        System.out.println("Enter the circle:");
        cir=sc.next().charAt(0);
        
            if(cir=='k')
            {
                total+=(ticket*75);
            }
            else if(cir=='q')
            {
                total+=(ticket*150);
            }
            else
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
            if(ticket>20)
            {
                dis=(total*10)/100;
                total-=dis;
            }
            if(cop=='y'||cop=='Y')
            {
                dis=(total*2)/100;
                total-=dis;
            }
            if(ref=='y'||ref=='Y')
            {
                total+=(ticket*50);
            }
        System.out.printf("Ticket cost:%.2f",total);
    }
}