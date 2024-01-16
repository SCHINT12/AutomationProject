package java_practice;

import oops_concepts.parentclass;

public class child_class {
	
//	public void  run() {
//		System.out.println("child_class_run");
//	}
//	
//	public void  eat() {
//		System.out.println("child_class_eat");
//	}
//	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		child_class obj=new child_class();
//		obj.eat();
//		obj.run();
		

		String name="shiva narayana";
		String revname="";
		int len=name.length();
		
		for(int i=len-1;i>=0;i--)
		{
			revname=revname+name.charAt(i);
			System.out.println(revname);
		}
				
		 
		
		
		
		

	}

}
