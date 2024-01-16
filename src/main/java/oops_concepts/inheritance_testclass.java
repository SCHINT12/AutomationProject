package oops_concepts;

public class inheritance_testclass extends parentclass {
	
	public void selectdropdown()
	{
		System.out.println("select dropdown");
	}
	
	
	
	

	public static void main(String[] args) {
		
		inheritance_testclass p=new inheritance_testclass();
		p.click();
		p.entertext();
		p.selectdropdown();
		p.clickusingjs();
		p.validatetext();
		
		int b=p.a;
		String name=p.name;
		System.out.println(b);
		System.out.println(name);

		
		
		
		

	
		
	}

}
