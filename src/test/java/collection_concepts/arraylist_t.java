package collection_concepts;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist_t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("eat"); //adding element to arraylist
		list.add("run");
		list.add("jump");
		list.add("drive");
		list.add("sleep");
		list.add("wakeup");
		

		System.out.println(list); // [eat, run, jump, drive, sleep, wakeup]
		
		System.out.println(list.get(0));  // getting first element
		
		Collections.sort(list);
		
		System.out.println(list); // [drive, eat, jump, run, sleep, wakeup]
		
		list.remove("run"); // removing element to arraylist
		
		System.out.println(list);  //[drive, eat, jump, sleep, wakeup]
		
		list.remove(4);
		
		System.out.println(list);  // [drive, eat, jump, sleep]
		
		for(String k:list)
		{
				System.out.println(k);
			
		}
		
		list.set(2, "swim");
		System.out.println(list);

		ArrayList<String> list1=new ArrayList<String>();
		list1.add("first");
		System.out.println("list1 is :"+list1);
		
		for(String n:list)
		{
			list1.add(n);

		}
		
		System.out.println(list1);
		
		list.clear();
		System.out.println(list);

	}

}
