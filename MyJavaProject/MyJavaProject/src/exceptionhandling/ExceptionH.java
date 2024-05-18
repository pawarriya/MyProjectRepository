package exceptionhandling;

public class ExceptionH {
	
		
		public static void main(String[] args) {
		
		System.out.println("Entered the bank");
		
		
		try {
		
			//int a = 10/0;
		//System.out.println("10 is divided by 0");  //this will not be executed because this is runtime error 10/0
		
		//int b = 10/5;
		//System.out.println("10 is divided by 5");  //this will be executed 

		
		int a[] = new int [3];
		
		a[0]= 1;
		a[1] = 7;
		a[2] = 3;
		//a[3] = 2;  //ArrayIndexOutOfBoundsException
		
		System.out.println("Array ");
		
	
		} catch (ArrayIndexOutOfBoundsException e) {   //(ArithmeticException e), (Throwable e) (Exception e)
			System.out.println("Exception handled");
		}
		
		
		Exception2 ex = new Exception2();
		
		ex.exception2();
		
		
	}
	

}
