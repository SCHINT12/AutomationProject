package java_practice;

public class if_elseif_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		int b=20;
		int c=345;

		if(a>b && a>c) {

			System.out.println("a is larger");

		}
		else if (b>c && b>a)
		{
			System.out.println("b is larger");
		}

		else {
			System.out.println("c is larger");
		}


	}

}
