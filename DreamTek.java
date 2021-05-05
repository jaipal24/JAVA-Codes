/*
DreamTek Company
DreamTek Company provides an initial training for all its employees, once they join the company. During the training phase they call the employees as “Associate”. The initial training is conducted for 60 days for each Associate. In these 60 days they learn various technologies. The first 20 days they learn “Core skills”, the next 20 days they learn “Advanced modules” and the final 20 days they go to the “Project phase”.  Help the DreamTek Company to find in which phase the associates are in.

Consider the below class:
<Java Class> >
Associate

a associateld: int
a associateName: String
workStatus: String

Associate()
getAssociateld():int
setAssociateld(int):void

private
public
constructor

getAssociateName():String
setAssociateName(String): void
getWorkStatus():String
setWorkStatus(String):void
trackAssociate Status(int): void


In the Associate class include the given attributes and methods with the access specifiers as specified in the class diagram.

The setter methods are used to set the value and the getter methods are used to retrieve the value.

The trackAssociateStatus method takes the number of days as argument and sets the work status of the associate based on the number of days. If the number of days is greater than 60 days then set the work status as “Deployed in project”.

 In the Main class, create an object for the Associate class; Get the details as shown in the sample input and assign the value for its attributes using the setters. Invoke the trackAssociateStatus method and find the work status and display the details as shown in the sample output.

Sample Input1:

Enter the associate id:

123

Enter the associate name:

john

Enter the number of days:

45

 Sample Output1:

The associate john work status:Project phase

 Sample Input2:

Enter the associate id:

124

Enter the associate name:

ram

Enter the number of days:

70

 Sample Output2:

The associate ram work status: Deployed in project
*/

public class Associate{
    private int associateId;
    private String associateName;
    private String workStatus;
    public Associate()
    {
        
    }
    public int getAssociateId()
    {
        return associateId;
    }
    public void setAssociateId(int num)
    {
        this.associateId=num;
    }
    public String getAssociateName()
    {
        return associateName;
    }
    public void setAssociateName(String name)
    {
        this.associateName=name;
    }
    public String getWorkStatus()
    {
        return workStatus;
    }
    public void setWorkStatus(String str)
    {
        this.workStatus=str;
    }
    public void trackAssociateStatus(int num)
    {
        if(num<=20)
        {
            setWorkStatus("Core skills");
        }
        else if(num<=40)
        {
            setWorkStatus("Advanced modules");
        }
        else if(num<=60)
        {
            setWorkStatus("Project phase");
        }
        else if(num>60){
            setWorkStatus("Deployed in project");   
        }
    }
}

import java.util.*;
public class DreamTek{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Associate asc=new Associate();
        System.out.println("Enter the associate id:");
        asc.setAssociateId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the associate name:");
        asc.setAssociateName(sc.nextLine());
        System.out.println("Enter the number of days:");
        asc.trackAssociateStatus(sc.nextInt());
        System.out.print("The associate "+asc.getAssociateName()+" work status:"+asc.getWorkStatus());
    }
}