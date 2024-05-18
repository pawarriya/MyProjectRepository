package javaprogram;

public class Matrix_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a= {{1,5,7},{2,4,6}};
		
		for(int row=0; row < a.length; row++) { //1 //2
			
		
			for(int col = 0; col < a[0].length ; col++) { //1 //5 //7 //2 //4 //6
				
				System.out.println("Row and Col are:" +a[row][col]);
				
			}
			System.out.println();
	
	}
	}
}



