package collectionframewrok;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsets {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>(); //Hashset->Set-> Collection 
		
		hs.add("My");
		hs.add("Name");
		hs.add("Is");
		hs.add("Riya");
		

		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			
			
		System.out.println("Hashset is: " +itr.next());
		//System.out.println("Information: "+s);  //this provides Random order 

	}
	}

}