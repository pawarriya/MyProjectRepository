package javaprogram;

public class Continueloop {

	public static void main(String[] args) {
		//continue
		int i =0;
		
		while(i < 10) {
			//i++;     ---- Output is from 1,2,4,5,6,7,8,9,10

			if(i == 3) {
				i++; ///------------Output is 0,1,2     ------IF this and below i++ is provided the output is 0,1,2,4,5,6,7,8,9

				continue;
			}
			System.out.println("Following is the value: "+i);
			i++; //only this 0,1,2 it will move in loop for above

		}
		
	}

}
