package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacter 
{

	public static void main(String[] args)
	{
		Map<Character, Integer> mp=new HashMap<Character, Integer>();
		
		String s="abbccddeee";
		
		char ch[]=s.toCharArray();
		
		for(char c:ch)
		{
			if(mp.containsKey(c))
			{
				mp.put(c, mp.get(c)+1);
			}
			else
			{
				mp.put(c, 1);
			}
		}
		System.out.println("duplicate characters :");
		
	Set <Entry<Character,Integer>> allentries=mp.entrySet();
		for(Entry<Character, Integer> en:allentries)
			
		{
			if(en.getValue()>1)
			{
				System.out.println(en.getKey()+ " : " + en.getValue());
			}
		}

	}

}
