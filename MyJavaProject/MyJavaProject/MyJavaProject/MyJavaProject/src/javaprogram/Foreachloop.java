package javaprogram;

public class Foreachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for each loop 
		
		int [] b = {4,2,3,10,11,6,5,9};
		
		for(int i:b) {
			
			if(i==5) { //it will not stop until it finds 5
				break;
			}
			System.out.println(i);
			
	}

}
}