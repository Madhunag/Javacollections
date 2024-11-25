package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample 
{

public static void main(String[] args)
	{
		Set<String> s=new HashSet<String>();
		
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("enter the names");
	
		
	   while(true)
	    {
	    name=sc.nextLine();
	    if(name.equalsIgnoreCase("done"))
	    {
		    break;
	    }
	    s.add(name);
	    
	    }
	 System.out.println(s);

	}

}
