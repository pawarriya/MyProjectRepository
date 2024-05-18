package override;

public class Parent {
	
	String Name;
	int Age;
	
	public void relation() {
		System.out.println("Name is: "+Name);
		System.out.println("Age is : "+Age);

	}
	
	public void relation(int a) {
		
		
		System.out.println("Overloading" +a);
	}
	

}

	