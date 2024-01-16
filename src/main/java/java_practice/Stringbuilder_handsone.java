package java_practice;

public class Stringbuilder_handsone {
	
	public static void main(String[] args) {
		
		//non-synchronised - handle multiple threads at a time , not thread safe
		//Mutable class
		//faster than String Buffer
		
		StringBuilder sb=new StringBuilder("Shiva narayana");
		sb.reverse();
		
		System.out.println(sb);
		
	}

}
