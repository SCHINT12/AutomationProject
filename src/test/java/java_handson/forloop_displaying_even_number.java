package java_handson;

public class forloop_displaying_even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// display even numbers from 1 to 100
		//output: 2,4,6,8,10 ..................100
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+ " ");
			}
		}

	}

}
