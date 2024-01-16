package java_practice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Constructors_practice {
	
	int a;
	String name;
	
	public Constructors_practice(int a,String name)
	{
	this.a=a;
	this.name=name;
	}
	
	
	
	public void display()
	{
		System.out.println(a+ ""+name );
	}
	

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructors_practice c=new Constructors_practice(100,"shiva");
		c.display();
		
		
		

	}

}
