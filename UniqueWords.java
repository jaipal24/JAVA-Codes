/*
Number of New Words
Miss.Jane, an experienced English professor, gives practice tests to her students to improve their written skills. Everyday students write an article and they submit it to Jane. Jane is particular that the students use only special characters like , ; : . ? ! in the article.
She counts the total number of words used and the number of new words used by the students in the article. Based on the analysis done on the new words used by the students she gives her feedback to the students.  
Jane finds it difficult when the number of students increase. So she wanted to automate the process in the following format. Help her to write a java program to display the new words using lower case and in alphabetical order.

Sample Input and Output - 1
Enter Student's Article
Hello Everybody, welcome to collection in JAVA. Collection, is like a container and powerful concept in Java!
Number of words 17
Number of unique words 14
The words are
1. a
2. and
3. collection
4. concept
5. container
6. everybody
7. hello
8. in
9. is
10. java
11. like
12. powerful
13. to
14. welcome

Sample Input and Output - 2
Enter Student's Article
hello Hello HEllo hi hi: hi! Welcome,   welcome
Number of words 8
Number of unique words 3
The words are
1. hello
2. hi
3. welcome
*/

//import the necessary packages if needed
import java.io.*; 
import java.util.*;
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
        public static void main (String[] args)
        {
            /* code */
            
            Scanner sc = new Scanner(System.in);
            int c=1;
            System.out.println("Enter Student's Article");
            String str = sc.nextLine();
            String [] words = str.split("[,;:.? !]+");
            for(int i=0;i<words.length;i++)
            {
                words[i] = words[i].toLowerCase();
            }
            System.out.println("Number of words "+words.length);
            
            ArrayList<String> li = new ArrayList<String>();
            Collections.addAll(li,words);
            Set s = new HashSet<String>(li);
            List<String> arr = new ArrayList<String>(s);
            Collections.sort(arr);
            System.out.println("Number of unique words "+arr.size());
            System.out.println("The words are ");
            for(String i :arr)
            {
                System.out.println(c+"."+i);
                c++;
            }
        }
}