/*
Insurance Bazaar

Insurance Bazaar is developing an online website for showcasing various types of Insurance policies to their customers based on their needs. There are various types of Insurances provided by different insurance agencies. The admin of Insurance Bazaar wants to add different insurance policy names like Max Bupa Health Insurance, SBI Health Insurance, IFFCO Tokio Two Wheeler Insurance and New India Assurance Two Wheeler Insurance to his database with Policy ID as the Tags.
Customers can view the names of all the polices available in Insurance Bazaar based on the type of insurance.
Write a Java program to simulate this scenario. Key (Policy ID) should be an Integer and Value (Insurance policy name) should be a String. The key-value should be sorted based on the key. Use the appropriate Collection to Store all these details and display.
The addPolicyDetails method should add the Policy ID and the Policy name into the appropriate map.
The searchBasedOnPolicyType method should return the list of Insurance policy ID depending on the input provided. This method takes the input as string (Input can be either Health or Two Wheeler).
The signature of the above functions are given as part of code skeleton, do not change the function signature.
Sample Policy ID and policy names:
Policy ID
policy names
10654
Max Bupa Health Insurance
10321
SBI Health Insurance
20145
IFFCO Tokio Two Wheeler Insurance
20165
New India Assurance Two Wheeler Insurance
10110
Reliance Health Insurance

Sample Input and Output1
Enter the no of Policy names you want to store
5
Enter the Policy ID
10654
Enter the Policy Name
Max Bupa Health Insurance
Enter the Policy ID
10321
Enter the Policy Name
SBI Health Insurance
Enter the Policy ID
20145
Enter the Policy Name
IFFCO Tokio Two Wheeler Insurance
Enter the Policy ID
20165
Enter the Policy Name
New India Assurance Two Wheeler Insurance
Enter the Policy ID
10110
Enter the Policy Name
Reliance Health Insurance
10110 Reliance Health Insurance
10321 SBI Health Insurance
10654 Max Bupa Health Insurance
20145 IFFCO Tokio Two Wheeler Insurance
20165 New India Assurance Two Wheeler Insurance
Enter the policy type to be searched
Two Wheeler
20145
20165
Sample Input and Output2
Enter the no of Policy names you want to store
4
Enter the Policy ID
10654
Enter the Policy Name
Max Bupa Health Insurance
Enter the Policy ID
10321
Enter the Policy Name
SBI Health Insurance
Enter the Policy ID
20145
Enter the Policy Name
IFFCO Tokio Two Wheeler Insurance
Enter the Policy ID
20165
Enter the Policy Name
New India Assurance Two Wheeler Insurance
10321 SBI Health Insurance
10654 Max Bupa Health Insurance
20145 IFFCO Tokio Two Wheeler Insurance
20165 New India Assurance Two Wheeler Insurance
Enter the policy type to be searched
Health
10321
10654 
*/

package com.ui;
import com.utility.*;
import java.util.*;
   
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		System.out.println("Enter the no of Policy names you want to store");
		int n=sc.nextInt();
		String s;
		int n1;
		Bazaar b1=new Bazaar();
		for(int i=1;i<=n;i++)
		{
		    System.out.println("Enter the policy ID");
		    n1=sc.nextInt();
		    System.out.println("Enter the policy Name");
		    sc.nextLine();
		    s=sc.nextLine();
		    b1.addPolicyDetails(n1,s);
		}
		Map<Integer,String>m1=b1.getPolicyMap();
		Set<Integer>keyset=m1.keySet();
		for(Integer i:keyset)
		{
		    System.out.println(i+"\t"+m1.get(i));
		}
		System.out.println("Enter the policy type to be searched");
		    String str1=sc.nextLine();
		    List<Integer>a=b1.searchBasedOnPolicyType(str1);
		    for(int i=0;i<a.size();i++)
		    System.out.println(a.get(i));
		
	}

}

package com.utility;
import com.ui.*;
import java.util.*;


public class Bazaar {
	
	private Map<Integer,String> policyMap;
	public Bazaar()
	{
	    policyMap=new TreeMap<Integer,String>();
	}
	
	public Map<Integer, String> getPolicyMap() {
		return policyMap;
	}

	public void setPolicyMap(Map<Integer, String> policyMap) {
		this.policyMap = policyMap;
	}

	//This method should add the policyID as key and policyName as value into the policyMap
	public void addPolicyDetails(int policyId,String policyName)
	{
		policyMap.put(policyId,policyName);
	}
	
	/*
	 * This method should search the policy name based on the policy type and add those policy names
	 * into the list and return the list.
	 * For example: If the map contains the key and value as:
	 *  10654 Max Bupa Health Insurance
	    10321 SBI Health Insurance
	    20145 IFFCO Tokio Two Wheeler Insurance
	    20165 New India Assurance Two Wheeler Insurance
	    10110 Reliance Health Insurance
		if the policy type is Health the output should be
		10110
		10321
		10654

	 */
	public List<Integer> searchBasedOnPolicyType(String policyType){
		
		List<Integer>al=new ArrayList<Integer>();
		Set<Integer>keyset=policyMap.keySet();
		for(Integer i:keyset)
		{
		    String s=policyMap.get(i);
		    if(s.indexOf(policyType)>=0)
		    al.add(i);
		}
	
		return al;
		
	}
	

}