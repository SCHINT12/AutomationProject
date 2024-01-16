package java_practice;

public class Types_of_varibles {
	
	static int a=10; // static variable
	 int b=20;
	 int e;
	
public static void main(String[] args)
{
	
	Types_of_varibles obj=new Types_of_varibles();
	obj.e=89;
	//int d=obj.b;
	obj.e=17; // local variable
			
	
	int c=a+obj.b;	
	System.out.println(c);


	
	
	
}

}
