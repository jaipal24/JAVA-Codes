/*
Multiple Operations
A module in a project requires you to set up two threads that will do two operations as bubble sort in one and linear search in another.
Note:-
1. Create a class called Operations that has functions to search, sort and print the array with data
2. The signature of the methods are as follows   
	public int search(int arr[], int x) 
        void bubbleSort(int arr[])
        void printArray(int arr[])
3. Create another class called MyThread that extends Thread
4. The MyThread class must implement the start() and run() methods
5. The class ThreadJoin must implement the main method from which two threads must be created, one that invokes sort and the other search
6. Make sure that the threads run in sequence. The Sort thread must be completed first before the second thread can start processing. However both the thread must be started at the same time
7. Also include appropriate logic to make sure the main thread waits for all the threads to be competed before exiting

The output must be as follows
How many numbers to sort ?
5
Enter the numbers
90
10
70
30
60
Enter the element to be searched
30

Starting Thread Sort
Starting Thread Search
Thread Sort exiting.
The sorted array is
10 30 60 70 90
Element is present at Position 2
Thread Search exiting.

*/

import java.util.*;
public class ThreadJoin
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers to sort ?");
        int n=sc.nextInt();
        
        System.out.println("Enter the numbers");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the element to be searched");
        int key=sc.nextInt();
        
        MyThread sort = new MyThread();
        MyThread search=new MyThread();
        
        try
        {
            System.out.println("Starting Thread Sort");
            System.out.println("Starting Thread Search");
            
            sort.start();
            search.start();
            
            sort.run(1,arr,0);
            sort.join();
            System.out.println("Thread Sort exiting.");
            System.out.println("The sorted array is");
            sort.run(3,arr,0);
            
            search.run(2,arr,key);
            System.out.println("Thread Search exiting.");
        }
        catch(Exception e)
        {
            
        }
        
    }   
    public static class MyThread extends Thread
    {
        public class Operations
        {
            public int search(int arr[],int x)
            {
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]==x)
                        return i;
                }
                return -1;
            }
            public void bubblesort(int arr[])
            {
                int n=arr.length;
                for(int i=0;i<n;i++)
                {
                    for(int j=1;j<(n-i);j++)
                    {
                        if(arr[j-1]>arr[j])
                        {
                            int temp=arr[j-1];
                            arr[j-1]=arr[j];
                            arr[j]=temp;
                        }
                    }
                }
            }
            public void printArray(int arr[])
            {
                for(int i:arr){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
        public void start(){
            
        }
        public void run(int i,int arr[],int x)
        {
            Operations op=new Operations();
            if(i==1)
            {
                op.bubblesort(arr);
            }
            if(i==2)
            {
                int k=op.search(arr,x);
                if(k>=0)
                    System.out.println("Element is present at Position "+(k+1));
                else
                    System.out.println("Element not found or wrong input");
            }
            if(i==3)
            {
                op.printArray(arr);
            }
        }
    }
}