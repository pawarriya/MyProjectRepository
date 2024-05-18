package overloading;

import java.util.Arrays;

public class Overloading {

	String CarName = "Tesla";
	int cost = 10000000;
	
	public static void main(String[] args) {
		login();
		login(3);
		login("Audi",900000);
		
		Overloading o1 = new Overloading("showroom");
		
		Overloadingclass o = new Overloadingclass();
		
		o.Overloading();
		
		
		
	}



public static void login() {   //no parameter passed
	
	String Username = "Tester";
	String Pwd = "123";
	System.out.println("Username is : "+Username+ " \n and Password is: "+Pwd);
	
}

public static void login(int a) {   //one parameter passed

	System.out.println("Webpages are total: "+a);
	
}

public static void login(String s, int a) { //two parameters passed
	

	
	System.out.println(s+ " was sold at Rs "+a);
	
}


//Overloading constructors

public Overloading(String s ) {
	
	String [] showroom = {"Mahindra", "Hundai"};
	
System.out.println("Following are showrooms: " +Arrays.toString(showroom));
	
}
}
