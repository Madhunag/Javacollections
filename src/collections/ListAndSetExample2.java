package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ListAndSetExample2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Set<String> uniqueAttendees=new HashSet<>();

		List<String> activities =new ArrayList<>();
		List<String> attendees=new ArrayList<>();
		
		List<List<String>> activityAttendees=new ArrayList<>();
		String activity;
		String attendee;
		
		System.out.println("enter activity names");
		while(true)
		{
		System.out.println("enter activity name");
		activity=scanner.nextLine();
		if(activity.equalsIgnoreCase("done"))
		{
		break;
		}
		
		activities.add(activity);
		}
		while(true)
		{
		System.out.println("enter attendee name");
		attendee=scanner.nextLine();
		if(attendee.equalsIgnoreCase("done"))
		{
		break;
		}

		if(uniqueAttendees.add(attendee))
		{
		attendees.add(attendee);
		}
		else
		{
		System.out.println( attendee +"has already registered for another activity");
		}
		

		activityAttendees.add(attendees);
		}
		scanner.close();
	
		System.out.println(activities);
		System.out.println(attendees);

		System.out.println(uniqueAttendees);
		
//System.out.println(activityAttendees);

	}

}

