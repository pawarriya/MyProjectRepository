package override;

import inheritance.ChildInheritance;

public class ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child c = new Child();
		
		c.Name = "Riya";
		c.Height = 156;
		c.relation(); //Duplicate method in a child class overrides method of parent class
		System.out.println("--------------Till here it is Override ----------------------");

		Parent p = new Parent();
		
		p.Name = "Ashok";
		p.Age = 67;
		
		p.relation(); //We can create multiple methods with same name inside the same class
		System.out.println("--------------Overloading ----------------------");
		p.relation(5);
		
	}


}
