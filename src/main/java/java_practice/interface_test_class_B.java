package java_practice;

public class interface_test_class_B implements interface_A,interface_classC,interfaces_classD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interface_test_class_B obj=new interface_test_class_B();
		obj.eat();
		obj.run();
		obj.sleep();
		obj.wakeup();
		obj.work();
		obj.taking();
		

	}

	
	public void eat() {

		System.out.println("eat");
	}

	
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("run");
		
	}


	public void sleep() {

		System.out.println("sleep");
	}


	public void wakeup() {
		System.out.println("wakeup");
		
	}

	public void work() {
		System.out.println("work");
	}

	public void taking() {
	System.out.println("taking");	
	}

}
