package collectionframewrok;

import java.util.HashSet;
import java.util.Set;

public class DemoHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
				
				Set<Integer> hs = new HashSet<Integer>(); //Hashset->Set-> Collection 
				
				hs.add(5);
				hs.add(7);
				hs.add(3);
				
				for(Integer temp : hs) {
					
					System.out.println(temp);
					
				}
				
			}

}
