package collection_concepts;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class HashSet_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> has=new HashSet<String>();
		has.add("eat");
		has.add("run");
		has.add("sleep");
		has.add("wakeup");
		has.add("walk");
		has.add("eat");
		has.add("work");
		
		System.out.println(has);
		
		has.remove("eat");
		
		System.out.println(has);

		
		
		
		
		
	}

}
