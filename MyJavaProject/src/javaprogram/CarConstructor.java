package javaprogram;

public class CarConstructor {
	
	String Model;
	String Color;
	int cost;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarConstructor CAR1 = new CarConstructor("Audi","Black",560000);
		CarConstructor CAR2 = new CarConstructor("Tesla","Blue",770000);
		
		CAR1.Cardetails();
		CAR1.Iscarstarting();
		CAR1.Iscarstopped();

		System.out.println("-----------------------------------------------");  

		CAR2.Cardetails();
		CAR1.Iscarstarting();
		CAR1.Iscarstopped();
		System.out.println("-----------------------------------------------");  
		
		
		
		
		//System.out.println("Car2 Car_ID and PurchasePlace is: "+CAR3);


	}
	
	public CarConstructor(String mdl, String Color, int cost){
		
		Model = mdl;
		this.Color=Color;
		this.cost = cost;
	}
	
public void Iscarstarting() {
			
			System.out.println(Model+ " Car is starting ");
		
		
	}
	
	

	public void Cardetails() {
		
		System.out.println("Color of the car is: " +Model);
		System.out.println("Color of the car is: " +Color);
		System.out.println("Cost of the car is: " +cost);

	}
	
	public void Iscarstopped () {
		System.out.println(Model+ " Car is Stopped ");
		
	}
	
	

}
