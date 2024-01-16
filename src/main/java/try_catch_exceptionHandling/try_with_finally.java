package try_catch_exceptionHandling;

public class try_with_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=10;
			int b=0;
			int c=10/0;
		}
		finally {

			System.out.println("Finally block");
		}

	}

}
