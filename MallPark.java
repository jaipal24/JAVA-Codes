/*
Mall Parking System
Westfield Shopping Mall is having a common two-wheeler parking stand in its basement. This parking facility is utilized by many of their customers regularly and they charge it for 10 Rupees per hour as parking fee. To make this facility more comfortable, they wish to automate the parking fee calculation based on the In-time and Out-time of a vehicle. For each vehicle entry, they will give a token which has the current date and time printed as In-time. The Out-time of each vehicle will the greater than the In-time. Help them to calculate the total Parking Fee by getting the In-time and Out-time as inputs.
Note:
The input In-time, must be in dd/MM/yyyy HH:mm format and must be lesser than the current system time for at-least 1 Minute. Otherwise, print “<In-Time> is an Invalid In-Time” and terminate.
The input Out-time, must be in dd/MM/yyyy HH:mm format and must be greater than the In-time for at-least 1 Minute. Otherwise, print “<Out-Time> is an Invalid Out-Time” and terminate.
Output must be the calculated total parking fee based on difference of hours in between In-time and Out-time with 10 Rupees per hour as parking fee.
Assumption: Consider the current system date and time as 29/10/2019 20:10

Sample Input 1:
In-time
20/09/2019 23:55
Out-time
21/09/2019 23:56
Sample Output 1:
250 Rupees

Sample Input 2:
In-time
25/10/2019 03:05
Out-time
25/10/2019 03:06

Sample Output 2:
10 Rupees

Sample Input 3:
In-time
29/10/2019 20:10

Sample Output 3:
29/10/2019 20:10 is an Invalid In-Time 
Explanation:   Invalid In-time since it is not lesser than the current system date and time  29/10/2019 20:10 for at-least 1 Minute

Sample Input 4:
In-time
20/09/2019 23:55
Out-time
20/08/2019 23:55

Sample Output 4:
20/08/2019 23:55 is an Invalid Out-Time
Explanation:   Invalid Out-time since it is not greater than the In-time for at-least 1 Minute
*/

import java.util.*;
 import java.text.*;
public class MallPark {
 
 public static void main(String [] args)throws Exception{
     Scanner sc=new Scanner(System.in);
     String s1="29/10/2019 20:10";
     String s2="",s3="";
     int f1=0;
     try
     {
     Date d1=new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(s1);
     System.out.println("In-time");
     s2=sc.nextLine();
     Date d2=new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(s2);
     f1=1;
     if(!(d2.before(d1)))
     {
         System.out.println(s2+" is an Invalid In-Time");
 
     }
     else
     {
     System.out.println("Out-time");
     s3=sc.nextLine();
     Date d3=new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(s3);
     
     //System.out.println(d3);
     if(!(d2.before(d3)))
     {
         System.out.print(s3+" is an Invalid Out-Time");
        
     }
     else
     {
     long min=(d3.getTime()-d2.getTime())/(1000*60);
     long hours=min/60;
     long r_min=min%60;
     long total=hours*10;
     if(r_min>0)
        total+=10;
     System.out.print(total+" Rupees");
     }
     }
    
     }
     catch(Exception e)
     {
         if(f1==1)
             System.out.println(s3+" is an Invalid Out-Time");
         else
             System.out.println(s2+" is an Invalid In-Time");
     }
     
     
     
 }
 }