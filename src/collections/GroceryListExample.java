package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryListExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<String> grocerieslist=new ArrayList<String>();
		System.out.println("Enter the groceries list and type done when finished");
		String item;
		String removeitem;
		while(true)
		{
			item=sc.nextLine();
			
			if(item.equalsIgnoreCase("done"))
				break;
			if(grocerieslist.contains(item))
			{
				System.out.println("Item listed already");
			}
			else
			{
				grocerieslist.add(item);
			}
		}
	//	grocerieslist.add(item);

		System.out.println(grocerieslist);
		
		System.out.println("Enter the items if u want to remove any item");
		
		while(true)
		{
			removeitem=sc.nextLine();
			if(removeitem.equalsIgnoreCase("done"))
				break;
			
	
			if(grocerieslist.contains(removeitem))
			{
				grocerieslist.remove(removeitem);
				
				System.out.println(grocerieslist);
			}
			else
			{
				System.out.println("Item removed already");
			}
		
		}
		grocerieslist.clear();
		System.out.println("list cleared");
	}
		
	}


