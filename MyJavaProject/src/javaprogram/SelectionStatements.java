package javaprogram;

public class SelectionStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int age=28 ,weight=50;
		
			if (age > 18) {
			    if (weight > 50) 
			        System.out.println("Eligible");
			    else {
			        System.out.println("Not Eligible: Weight is not greater than 50");
			    }
			} else {
			    System.out.println("Not Eligible: Age is not greater than 18");
			}
			
		}

public static void  Statement(){

		
	int marks=60;
	
	if(marks> 80) {
		System.out.println("Distinct");
		
	}else if (marks < 80 & marks > 60) {
		System.out.println("Good");
	
	}else if (marks < 60 & marks >= 50){
	System.out.println("Pass");
		}
	else {
		System.out.println("Fail");
	}

}
}
