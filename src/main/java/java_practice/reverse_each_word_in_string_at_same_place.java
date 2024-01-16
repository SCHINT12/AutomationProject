package java_practice;

import java.util.Scanner;

public class reverse_each_word_in_string_at_same_place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the string to be reversed");
//		String  name=sc.next();
		
		String name="My name is Shiva Narayana";
		String[] words=name.split(" ");
		
		String revstring="";
		
		for(String word:words)
		{
			String reverseword="";
			for(int i=word.length()-1;i>=0;i--)
			{
				
				reverseword=reverseword+word.charAt(i);
				System.out.println(reverseword);

			}
			
			revstring=revstring+reverseword+" ";
			System.out.println(revstring);
		}
		
		//System.out.println(revstring);
		
	
		//reverseword reverseword word.charAt(i)
//		"" "" y  y
//		y y M  yM
		

	}

}
