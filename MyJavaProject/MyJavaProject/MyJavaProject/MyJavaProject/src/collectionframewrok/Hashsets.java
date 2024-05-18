package collectionframewrok;

import java.util.HashSet;

public class Hashsets {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>(); //Hashset->Set-> Collection 
		
		hs.add("My");
		hs.add("Name");
		hs.add("Is");
		hs.add("Riya");
		

		
		for(String s : hs) {
		
		System.out.println("Information: "+s);  //this provides Random order 

	}
	}

}
