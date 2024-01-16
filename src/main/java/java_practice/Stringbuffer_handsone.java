package java_practice;

public class Stringbuffer_handsone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//mutable-> user can able to change
		
		//synchronised - handle one thread at a time , thread safe
		//Mutable class
		//slower than String Builder
		
		StringBuffer sb=new StringBuffer("Shiva Narayana");
		sb.reverse();
		System.out.println(sb);

		

	}

}
