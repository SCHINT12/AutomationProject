package collection_concepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap_handson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Character> hm=new HashMap<Integer,Character>();
		hm.put(7, 'c');
		hm.put(8, 'f');
		hm.put(0, 'r');
		hm.put(2, 's');
		
		System.out.println(hm);
		
		// 1 way
		
		for(Integer i:hm.keySet())
		{
			//System.out.println(i+ " "+hm.get(i));
			System.out.print(i+" ");
		}
		
		System.out.println("#diji");
		
		// 2 way
		
		for(Map.Entry hm1:hm.entrySet())
		{
			System.out.println(hm1.getKey()+ " "+hm1.getValue());
		}
		
		System.out.println("##########################");
		// getting all values
		
		Collection<Character> values=hm.values();
		System.out.println(values);
		for(Character val:values)
		{
			System.out.println(val);
		}
		
		// getting all keys
		
		Set<Integer> keys=hm.keySet();
		System.out.println(keys);
		
		//remove elements
		
		hm.remove(8);
		
		System.out.println(hm);
		
		

	}

}
