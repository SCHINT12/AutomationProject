package java_practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class count_occurence_of_character_in_string {

	public static void main(String[] args) {

		String str="ABBCCCDDDDEEEEEAAA";
	    char[] ch=str.toCharArray();
	    LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<Character,Integer>();
	    System.out.println(lhm);
	    
	    for(Character c:ch)
	    {
	    	if(lhm.containsKey(c))
	    	{
	    		lhm.put(c, lhm.get(c)+1);
	    		System.out.println(lhm);
	    	}
	    	
	    	else
	    	{
	    		lhm.put(c, 1);
	    		System.out.println(lhm);
	    	}
	    	
	    	
	    }
	    
	    for(Map.Entry h:lhm.entrySet())
	    {
	    	System.out.println(h.getKey()+ " repeated "+h.getValue()+ " times");
	    }
		
	    
	}

}
