package inheritance;

public class MainClass {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentInheritance p = new ParentInheritance();
		
		p.Name = "Ashok";
		p.age = 68;
			
		p.Parent();	
		System.out.println("-----------------------------------");

		ChildInheritance c = new ChildInheritance();
		c.Name = "Riya";
		c.age = 27;
		c.Height = 156;
		
		c.Parent();  //It is imp to call CHild object with parent methods
		c.Child();
		c.child1();

	}

}
