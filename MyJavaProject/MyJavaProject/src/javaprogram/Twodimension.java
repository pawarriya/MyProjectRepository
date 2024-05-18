package javaprogram;

public class Twodimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a= new int [2] [3];
		
		a[0][0] = 9;
		a[0][1] = 3;
		a[0][2] = 7;
		
		a[1][0] = 2;
		a[1][1] = 1;
		a[1][2] = 5;

		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		
		int [][] b= {{1,4,5} , {7,1,6,9}};
		
		System.out.println("Number of rows are: "+b.length); //row
		System.out.println("Number of Col are: "+b[0].length); //col



	}

}
