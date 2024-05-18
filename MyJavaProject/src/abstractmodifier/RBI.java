package abstractmodifier;



public class RBI {

	public static void main(String[] args) {
		
		  //trying to create object
			// Bank b = new Bank();  //Error because abstract class cannot be called using object reference 
			
			//To resolve create Child class and create an object 

		
		HDFC hd = new HDFC();	

		
	hd.currentaccount();
	hd.savingaccount();
	
	hd.bankdetails();
	

	}

}
