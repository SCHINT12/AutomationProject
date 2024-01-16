package collection_concepts;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treemap_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,Character> lhm=new TreeMap<Integer,Character>();
		lhm.put(7, 'c');
		lhm.put(8, 'f');
		lhm.put(0, 'r');
		lhm.put(2, 's');
		
		System.out.println(lhm);
		
		// 1 way
		
		for(Integer i:lhm.keySet())
		{
			System.out.println(i+ " "+lhm.get(i));
		}
		
		// 2 way
		
		for(Map.Entry lhm1:lhm.entrySet())
		{
			System.out.println(lhm1.getKey()+ " "+lhm1.getValue());
		}
		
		System.out.println("##########################");
		// getting all values
		
		Collection<Character> values=lhm.values();
		System.out.println(values);
		for(Character val:values)
		{
			System.out.println(val);
		}
		
		// getting all keys
		
		Set<Integer> keys=lhm.keySet();
		System.out.println(keys);

	}

}
