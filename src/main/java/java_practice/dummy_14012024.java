package java_practice;

public class dummy_14012024 implements dummy__interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dummy_14012024 d2=new dummy_14012024();
		
		d2.add(4.5f, 5);
		d2.add(7, 8);
		d2.add(7818818, 848847748);
		d2.eat();
		d2.run();
		
	

	}
	
	public int add(int a,int b)
	{
		System.out.println(a+b);
		return(a+b);
	}
	
	public float add(float a,float b)
	{
		System.out.println(a+b);
		return(a+b);
	}
	
	public long add(long a,long b)
	{
		System.out.println(a+b);
		return(a+b);
	}

	@Override
	public void run() {
		
		System.out.println("run");
		
	}

	@Override
	public void eat() {
		
		System.out.println("eat");
		
	}
	
	
	

}
