import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException
	{
		
	File my=new File("C:/Users/akshay/Desktop/my.csv"); 
	Scanner scan=new Scanner(my);
	
	String linedata="";
	
    while(scan.hasNextLine())
    {
    	linedata=scan.nextLine();
    String values[]=linedata.split(",");
    System.out.println(values[0]);
    System.out.println(values[1]);
	}
		}
}
