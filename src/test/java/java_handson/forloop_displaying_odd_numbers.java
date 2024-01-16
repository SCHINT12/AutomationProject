package java_handson;

public class forloop_displaying_odd_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// display odd numbers from 1 to 100
				//output: 1,3,5,7,9 ..................99
				
				for(int i=1;i<=100;i++)
				{
					if(i%2!=0)  // (or) i%2==0
					{ 
						System.out.print(i+ " ");
					}
				}

	}

}
