package try_catch_exceptionHandling;

public class try_catch_block_with_finally_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			
		}
		catch (Exception e) {
			
			System.out.println("exception");
			System.out.println("error1");
			System.out.println("error1");

			System.out.println("error1");

			System.out.println("error1");
		}
		
		finally {
			
			System.out.println("finally");
		}

	}

}
