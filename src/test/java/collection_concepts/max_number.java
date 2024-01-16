package collection_concepts;

import java.util.ArrayList;
import java.util.Collections;

public class max_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lst=new ArrayList<Integer>();
		lst.add(889);
		lst.add(90);
		lst.add(89);
		lst.add(9);
		
		int k=Collections.max(lst);
		System.out.println(k);
		
		int n=Collections.min(lst);
		System.out.println(n);
		

	}

}
