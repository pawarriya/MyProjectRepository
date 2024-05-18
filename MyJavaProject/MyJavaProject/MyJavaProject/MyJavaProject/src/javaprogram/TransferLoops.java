package javaprogram;

public class TransferLoops {

	public static void main(String[] args) {

		int i=0;
		
		//while(i < 5) {
		/*	
			if(i==3) {
				break;
			}
			System.out.println("Following loop having value of "+i);
		i++;*/
			
						
			do {					
				
				System.out.println("Following loop value is: "+i);
				i++;

				if(i==3) {
				System.out.println("i is equal to 3 loop ends");
						break;
				}
			}while(i<5);
			
	}
		
}
	

