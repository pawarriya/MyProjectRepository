package javaprogram;

import java.time.LocalDate;

public class Car {
	
	LocalDate purchasedate;
	String Model;
	String Color;
	int Cost;
	
	public static void main (String args[]) {
		
		
		Car Tesla = new Car();
		
		Tesla.purchasedate = LocalDate.of(2024,4,24);
		Tesla.Color = "Black";
		Tesla.Model = "High";
		Tesla.Cost = 5600000;
		
		Tesla.Iscarstarting();
		Tesla.Cardetails();
		//System.out.println("For Tesla Car is purchased on " +Tesla.purchasedate);
		//System.out.println("For Tesla Car Color is " +Tesla.Color);
		//System.out.println("For Tesla Car Model is " +Tesla.Model);
		//System.out.println("For Tesla Car Cost is " +Tesla.Cost);

		
		Car Audi = new Car();
	
		Audi.purchasedate = LocalDate.of(2023,1,24);
		Audi.Color = "Red";
		Audi.Model = "Q7";
		Audi.Cost = 500000;
		Audi.Iscarstopped();
		
		Audi.Cardetails();

		
		
	}
	//car details - purchase date, Model, Color, Cost
	 
	
	public void Iscarstarting() {
		
		System.out.println(Model+ " Car is starting ");
		
		
	}
	
	public void Cardetails() {
		
		System.out.println("Color of the car is: " +purchasedate);
		System.out.println("Color of the car is: " +Model);
		System.out.println("Color of the car is: " +Color);
		System.out.println("Color of the car is: " +Cost);
		
	}
	
	public void Iscarstopped () {
		System.out.println(Model+ " Car is Stopped ");
		
	}
	

}
