/*
Least offer
Maya buys “N” no of products from a shop. The shop offers a different percentage of discount on each item. She wants to know the item that has the minimum discount offer, so that she can avoid buying that and save money.
[Input Format: The first input refers to the no of items; the second input is the item name, price and discount percentage separated by comma(,)]
Assume the minimum discount offer is in the form of Integer.
Note: There can be more than one product with a minimum discount.

Sample Input 1:
4
mobile,10000,20
shoe,5000,10
watch,6000,15
laptop,35000,5
Sample Output 1:
shoe
Explanation: the discount on the mobile is 2000, the discount on the shoe is 500, the discount on the watch is 900 and the discount on the laptop is 1750. So the discount on the shoe is the minimum.
Sample Input 2:
4
Mobile,5000,10
shoe,5000,10
WATCH,5000,10
Laptop,5000,10
Sample Output 2:
Mobile 
shoe 
WATCH 
Laptop
*/

import java.util.*;
public class LeastOffer{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     // Fill the code here
        int items=sc.nextInt();
        sc.nextLine();
        String line;
        String[] names=new String[items];
        String[] lineVector;
        int[] cost=new int[items];
        int[] disper=new int[items];
        double[] discount=new double[items];
        for(int i=0;i<items;i++)
        {
            line=sc.nextLine();
            lineVector=line.split(",");
            //for(int j=0;j<lineVector.length;j++)
            //    System.out.println(lineVector[j]);
            names[i]=lineVector[0];
            cost[i]=Integer.parseInt(lineVector[1]);
            disper[i]=Integer.parseInt(lineVector[2]);
        }
        double min=99999;
        for(int i=0;i<items;i++)
        {
            discount[i]=(cost[i]*disper[i])/100;
            if(discount[i]<=min)
            {
                min=discount[i];
            }
        }
        for(int i=0;i<items;i++)
        {
            if(discount[i]==min)
            {
                System.out.println(names[i]);
            }
        }
    }
}