package java_handson;

public class performance_check_string_stringbuffer_stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //String
		long starttime=System.currentTimeMillis();
		String str="java";
		for(int i=0;i<100000;i++)
		{
			str.concat("test");
		}
		
		System.out.println("Execution time for String :"+(System.currentTimeMillis()-starttime));
		
		// String Buffer
		
		starttime=System.currentTimeMillis();
		
		StringBuffer sb=new StringBuffer("test");
		for(int i=0;i<100000;i++)
		{
			sb.append("java");
		}
		System.out.println("Execution time for StringBuffer :"+(System.currentTimeMillis()-starttime));

		
		// String Builder
		
				starttime=System.currentTimeMillis();
				
				StringBuilder sbf=new StringBuilder("test");
				for(int i=0;i<100000;i++)
				{
					sbf.append("java");
				}
				System.out.println("Execution time for StringBuilder :"+(System.currentTimeMillis()-starttime));
		
		
		//int k=80;
				
		long time=System.currentTimeMillis();
		
		for(long k=0;k<67000000;k++)
		{
			System.out.println(k);
			
		}
		
		System.out.println("end");
		
		System.out.println(System.currentTimeMillis()-time);
		
		
		
		
		
		
		
		
		
		
	}

}