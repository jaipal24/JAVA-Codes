/*
Count of Each Words

Miss.Jane, an experienced English professor, gives practice tests to her students to improve their written skills. Everyday students write an article and they submit it to Jane. Jane is particular that the students use only special characters like , ; : . ? ! in the article.
[Note : Using the above mentioned special characters will help to split the words in a sentence. 
All other special characters when used will be considered as a part of the word itself. ]
She counts the total number of words used and the count of each word in the article. Based on this analysis she gives her feedback to the students.  
Difficulty arises when the number of students increase. So she wanted to automate the process in the following format. Help her to write a java program to display the words and the number of times it has been used in the article and to display the words using lower case and in alphabetical order.
Enter Student's Article
hello Hello HEllo hi hi: hi! Welcome,   welcome
Number of words 8
Words with the count
hello: 3
hi: 3
welcome: 2
*/

import java.util.*;
//import the necessary packages if needed
@SuppressWarnings("unchecked")//Do not delete this line
public class CountOfWords
{
                public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Student's Article");
                String s1=sc.nextLine();
                String s=s1.toLowerCase();
                String a[]=s.split("[,;:. ?!]+");
                Set <String> set=new TreeSet<>();
                for(int i=0;i<a.length;i++)
                {
                     set.add(a[i]);
                }
                System.out.println("Number of words "+a.length);
                System.out.println("Words with the count");
                Iterator it = set.iterator(); 
                while(it.hasNext()) {
                      String s11=(String) it.next();
                      int c=0;
                      for(int i=0;i<a.length;i++){
                             if(s11.equals(a[i]))
                              {
                                   c=c+1;
                              }
                         }
                  System.out.println(s11+": "+c);
                  }
                }
                
                }