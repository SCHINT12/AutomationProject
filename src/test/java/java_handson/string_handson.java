package java_handson;

public class string_handson {

	public static void main(String[] args) {

		String str="    Abc Def   ";
		
		
		int length=str.length();
		System.out.println("Length is "+length);
		
		str=str.trim();
		System.out.println("trimmed string: "+str);
		System.out.println("Trimmed string Length is "+str.length());
		
		int index=str.indexOf('f');
		System.out.println("index of f : "+index);
		
		char c=str.charAt(5);
		System.out.println("char present at index 5 is "+c);
		
		//remove space
		
		str=str.replace(" ", "");
		System.out.println("String with no space : "+str);
		System.out.println("Length is "+str.length());
		
		// lower case
		str=str.toLowerCase();
		System.out.println("String with lowercase : "+str);
		
		// upper case
				str=str.toUpperCase();
				System.out.println("String with uppercase : "+str);
				
				
		
		
		
		
		
		
		
		
	}

}
