package java_practice;

public class and_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=200;
		int c=30;
		
		boolean flag=a>b;  //false
		boolean flag1=b>c; //true
		boolean flag2=flag && flag1; //true
		
		System.out.println(flag + " " +flag1+ " "+flag2);

	}

}
