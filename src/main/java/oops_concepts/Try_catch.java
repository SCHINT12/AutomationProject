package oops_concepts;

import java.io.FileNotFoundException;

public class Try_catch {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		
		try
		{
			int a=10;
			System.out.println(a/0);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("test");
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
