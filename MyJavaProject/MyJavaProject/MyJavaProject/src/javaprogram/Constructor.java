package javaprogram;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor C1= new Constructor();
		
		Constructor C2= new Constructor(5);

	}
	
		
	
	public Constructor() {
		
	
		System.out.println("Hi Constructor");
		
	}
	public Constructor(int a) {
		
		int Store = 5; 
		
		System.out.println("Constructors are: "+Store);
		
	}
	
	

}
