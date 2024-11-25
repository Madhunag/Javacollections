package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ListAndSetExample {

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 List<String> list=new ArrayList<String>();
	 Set<String> attendeeset=new LinkedHashSet<String>();
	 Set<String> activityset=new LinkedHashSet<String>();
	 String attendee;
	 String activity;
	while(true)
	{
		System.out.println("enter the attendee name:");
		
		attendee=sc.nextLine();
		if(attendee.equalsIgnoreCase("done"))
		{
			break;
		}
		
		
		if(list.contains(attendee))
		{
			System.out.println("attendee name already registered");
		}
		else
		{
			list.add(attendee);
		}
		
	
		//attendeeset.addAll(list);
	}
	while(true)
	{
		
		
		System.out.println("enter the activity of"+ attendee);
		activity=sc.nextLine();
		if(activity.equalsIgnoreCase("done"))
		{
			break;
		}
		activityset.add(activity);
		
	}
	sc.close();
	System.out.println("List of attendees and their activities");
	System.out.println(list + " : " +activityset);
	}
}
	
	
	 
	 
	 
	


