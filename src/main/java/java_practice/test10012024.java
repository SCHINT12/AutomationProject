package java_practice;

public class test10012024 {
	
	public static int sum(int a,int b)
	{
		System.out.println(a+b);
		return(a+b);
	}
	
	public static int sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
		return(a+b+c);
	}
	
	public static int sum(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
		return(a+b+c+d);
	}
	
	public static int sum(int a,int b,int c,int d,int e)
	{
		System.out.println(a+b+c+d+e);
		return(a+b+c+d+e);
	}
	
	public static float sum(float a,float b,float c,float d,float e)
	{
		System.out.println(a+b+c+d+e);
		return(a+b+c+d+e);
	}
	
	
	public static void main(String[] args) {
		
		sum(8, 9);
		sum(8, 9, 4);
		
		
	}

}
