package exceptionhandling;

public class Exception2 {
	
	public void exception2() {
		
		System.out.println("Hello");
		
		try {
			
			int s = 10/0;
			
			System.out.println("NULL");
			
			int c = 7;
			System.out.println(c);
		} catch (Exception e) {
			
			int a =15;
			
			System.out.println("Excpetion occured" +a);
		}
	}

}
