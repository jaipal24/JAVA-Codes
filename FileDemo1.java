/*
Finding the longest word
Write a java program display the longest word from the given file
*/

import java.io.*;
public class FileDemo1{
    public static void main(String[] args)throws Exception
    {
        FileReader fr=new FileReader(new File("log.txt"));
        BufferedReader br=new BufferedReader(fr);
        String s,res="";
        while((s=br.readLine())!=null)
        {
            String[] str=s.split(" ");
            for(int i=0;i<str.length;i++)
            {
                if(str[i].length()>=res.length())
                {
                    res=str[i];
                }
            }
        }
       System.out.println(res);
    }
}