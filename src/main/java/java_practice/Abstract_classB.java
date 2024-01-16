package java_practice;

public class Abstract_classB extends Abstract_classA{
	
	
	void eat() {
		System.out.println("ClassA eat");
	}

	
	void run() {
		System.out.println("classA run");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstract_classB obj=new Abstract_classB();
		obj.run();
		obj.eat();
		obj.jump();
		
		
		

	}

	
	
}
