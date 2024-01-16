package Encapsulation;

public class testclass extends classA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//classA a=new classA();
		
		testclass a=new testclass();
		
		a.setA(87);
		a.setName("sdf");
		System.out.println(a.getA());
		System.out.println(a.getName());

	}

}
