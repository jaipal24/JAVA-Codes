/*
Counting the Word in the given file
Tom's mam is preparing a puzzle for a school annual day. As part of it, Tom's mam has got a file that has information about knowledge. 
She needs to find out the total count of the word "knowledge"(CASE INSENSITIVE) from the file.  
Tom wanted to help her teacher in completing the task easily by writing a java program and displaying the total count of the word "knowledge".
Help Tom in implementing the task. 
*/

import java.io.*;
public class FileDemo2{
    public static void main(String[] args)throws Exception
    {
        FileReader fr=new FileReader(new File("log.txt"));
        BufferedReader br=new BufferedReader(fr);
        String s;
        int count=0;
        while((s=br.readLine())!=null)
        {
            String[] str=s.split(" ");
            for(int i=0;i<str.length;i++)
            {
                if(str[i].toLowerCase().equals("knowledge"))
                {
                    count++;
                }
            }
        }
       System.out.println(""+count);
    }
}