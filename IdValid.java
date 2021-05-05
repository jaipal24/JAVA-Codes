/*
Employee ID Validation

Global Info Technologies has approached you to develop an application to maintain the work details of their employees. 
Imagine you are developing the login module. In that module,you will have to validate the id with the format given from the client.
The format is "GBL/001/0417", here the first three letters are standard. 
Create a class UserMain and implement the functionalities which are required.

Sample Input 1:
Enter your ID
GBL/020/0715

Sample Output 1:
Login success

Sample Input 2:
Enter your ID
ABC/120/0215

Sample Output 2:
Incorrect ID
*/

import java.util.*;
class IdValid
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your ID");
        String id=sc.nextLine();
        String[] str_arr=id.split("/");
        //System.out.println(str_arr[0]);
        if(str_arr[0].equals("GBL")&&str_arr[1].length()==3&&str_arr[2].length()==4)
        {
            System.out.println("Login success");
        }
        else
            System.out.println("Incorrect ID");
    }
}