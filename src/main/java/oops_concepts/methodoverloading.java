package oops_concepts;

public class methodoverloading {
	
	public int sum(int a)
	{
		return a;
	}
	
	public float sum(float b)
	{
		return b;
	}
	
	
	public  int sum(int a , int b)
	{
		return a+b;
	}
	
	public static float sum(int a , float b)
	{
		System.out.println(a+b);
		return a+b;
	}
	
	public static int sum(int a , int b,int c , int d)
	{
		System.out.println(a+b+c+d);
		return a+b+c+d;
	}
	
	public static float sum(float a , float b,float c , int d)
	{
		System.out.println(a+b+c+d);
		return a+b+c+d;
	}
	
	public void main(int a)
	{
		System.out.println(a);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		methodoverloading m=new methodoverloading();
//		
//		System.out.println(m.sum(1, 2));
//		int c=m.sum(1, 2);
//		System.out.println(c);
		sum(4, 5, 6, 9);
		sum(4.5f, 6.7f, 7.8f, 8);

	}
	
	public static void main(String args){
		System.out.println("main with String");
		}  
	public static void main(){
		System.out.println("main without args");
		}  

}
