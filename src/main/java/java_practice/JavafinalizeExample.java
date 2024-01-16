package java_practice;

public class JavafinalizeExample {
	
	//Finalize-  finalize in java represents a method. 
	//The finalize() method is called by run-time system just before an object is collected by garbage collector. It normally contains system resources release code

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 JavafinalizeExample obj = new JavafinalizeExample();  
	        obj = null; 
	        // calling garbage collector  
	        System.gc(); 
	        System.out.println("end of garbage collection"); 

	    } 
	    @Override
	    protected void finalize() 
	    { 
	        System.out.println("finalize method called"); 
	    }

	}


