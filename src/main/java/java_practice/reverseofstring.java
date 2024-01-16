package java_practice;

public class reverseofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="shiva";
		
		String reversestring="";
		
		int len=name.length();
		
		for(int i=len-1;i>=0;i--)
		{
			
			reversestring=reversestring+name.charAt(i);
			System.out.println(reversestring);

		}
		
		//System.out.println(reversestring);
		
		
				
				

	}

}
