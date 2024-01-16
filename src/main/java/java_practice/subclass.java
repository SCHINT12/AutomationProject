package java_practice;

public class subclass extends super_parent_class {
	
	
	public void run()
	{
		System.out.println("child run");
		System.out.println(super.car);
		
	}
	
	public void eat()
	{
		System.out.println("eat");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subclass s=new subclass();
		s.run();
		

	}

}
