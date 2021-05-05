/*
Print Customer Details
Help Mr.Ben who is a programmer, in developing a registration form on console. Customers will not just input data, but also view the details once he/she finishes the registration. 
Sample Input 1:
Enter your name:Jany
Enter age:25
Enter gender:Female
Hailing from:Mexico
Sample Output 1:
Welcome, Jany!
Age:25
Gender:Female
City:Mexico
*/

import java.io.*;
import java.util.Scanner;
class Customer
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String name,gender,city;
        int age;
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter age:");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter gender:");
        gender=sc.nextLine();
        System.out.println("Hailing from:");
        city=sc.nextLine();
        System.out.println("Welcome, "+name+"!\nAge:"+age+"\nGender:"+gender+"\nCity:"+city);
    }
}