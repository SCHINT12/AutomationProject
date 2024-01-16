package java_practice;

public class for_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr= {1,2,3,4};
//		
//		for(Integer arr2:arr)
//		{
//			System.out.println(arr2);
//		}
		
		String str="ShivaNarayana";
		char[] ch=str.toCharArray();
		String str1="";
		int i=str.length()-1;
		for(Character ch1:ch)
		{
			str1=str1+str.charAt(i);
			i--;
		}
		System.out.println(str1);
		

	}

}
