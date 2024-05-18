package javaprogram;

public class Addition {



	public static void main(String[] args) {

		int result =  addition(5,4);
		System.out.println("Addition is " +result);
		
		//String Result1 =social();
		//System.out.println("Login into: "+Result1);
		
		String [] Result3 = social("Facebook","Google", "Gmail");
		
		for( String media: Result3) {
		System.out.println("Please login with : " +media);
	}
	}
	
	public static int addition (int a, int b) 
	{
		
		int sum = a+b;
		return sum;
		
	}

	
		public static String[] social(String fb,String gg, String gm ) {
			
		String[] s = {"Facebook","Google","Gmail"};
			//return "LinkedIn"; //single
		return s;
		
		}
}

	