package collection_concepts;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.HashMap;
import java.util.*;
import java.util.Set;
import java.util.TreeMap;

public class hhashmap_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		LinkedHashMap<Integer, String> ham=new LinkedHashMap<Integer, String>();
		ham.put(1,"a");
		ham.put(45,"b");
		ham.put(87,"c");
		ham.put(9,"d");
		ham.put(34,"e");
		
		System.out.println(ham);
		
		
		Set<Integer> keys=ham.keySet();
		System.out.println(keys);
		
		for(Integer i:ham.keySet())
		{
			System.out.println(i+" "+ham.get(i));
		}
		
		System.out.println("#####");
		for(Map.Entry h:ham.entrySet())
		{
			System.out.println(h.getKey()+" "+h.getValue());
		}
		
		ham.remove(3);
		
		System.out.println(ham);
		ham.put(6, "f");
		
		
		System.out.println(ham);
		
		for(Map.Entry a:ham.entrySet())
		{
			System.out.println(a.getValue()+" "+a.getKey());
		}
		
		
		
		
		

	}

}
