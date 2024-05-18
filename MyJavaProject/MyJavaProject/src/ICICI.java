
	
	public abstract class ICICI implements Banking{

		//Interface implements is mentioned with abstract keyword for Child class and for class we write
		//extends 
		@Override
		public void Account() {
			System.out.println("Account is created");
		}

		@Override
		public void ViewAccount() {
		
			System.out.println("Account is viewed");

		}

	//If I dont want third method
		//public void Lead() {
		
			
	}


