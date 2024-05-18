package javaprogram;

public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 2;
		String daystring;
		
		switch (day) {
			case 1:
				daystring ="Monday";
				break;
				
			case 2 : 
				daystring ="Tuesday";
				break;
				
			case 3 : 
				daystring ="Wednesday";
				break;
			case 4 : 
				daystring ="Thursday";
				break;
			case 5 : 
				daystring = "Friday";
				break;
			case 6 : 
				daystring ="Saturday";
				break;
			case 7 : 
				daystring ="Sunday";
				break;
				
			default:
				daystring ="Invalid";
				
		}
		System.out.println("Today is day "+daystring);
	}

}
