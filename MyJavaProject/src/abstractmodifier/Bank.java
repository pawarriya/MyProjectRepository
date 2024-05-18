package abstractmodifier;

public abstract class Bank {
	
	
	public abstract void currentaccount();  //No method is created for abstract method
	
	public void savingaccount() {
		
		System.out.println("Account is Saving");
		
	}
		
		public void bankdetails(){
			
			String name= "Localbank";
			String Status = "Closed";
			
			System.out.println("Bank is "+Status);
			
		}
	}
	
	



