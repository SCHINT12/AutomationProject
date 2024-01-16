package collection_concepts;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(19);
		list.add(72);
		list.add(32);
		list.add(42);
		list.add(78);
		list.add(100);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.set(2, 73);
		System.out.println(list);
		
		list.addFirst(1111);
		System.out.println(list);
		
		list.addLast(77);
		System.out.println(list);
		
		
		
		
		

	}

}
