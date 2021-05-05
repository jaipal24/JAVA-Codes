/*
Retrieving Data from file
Allen started working with I/O in java. Allan's mam has written some contents in the log.txt file. 
Help Allen to write a java code to display the contents of the file in the console.
*/

import java.io.*;
public class FileDemo3
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr=new FileReader(new File("log.txt"));
        BufferedReader br=new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null)
        {
            System.out.println(s);
        }
    }
}