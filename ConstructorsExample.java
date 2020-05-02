class ConstructorExample {
	// data members
	int ConstructorExampleId = 10; String ConstructorExampleName = "Vamsi";
	
	// default constructor or non parameterized constructor
	public ConstructorExample() {
		System.out.println("Default Constructor Invoked....");
		this.ConstructorExampleId = 101;
		this.ConstructorExampleName = "King Kochar";
	}
	
	// parameterized constructor
	public ConstructorExample(int sid,String sname) {
		System.out.println("Parameterized Constructor Invoked....");
		this.ConstructorExampleId = sid;
		this.ConstructorExampleName = sname;
	}

	// parameterized constructor with object reference
	public ConstructorExample(ConstructorExample obj) {
		System.out.println("Copy constructor invoked....");
		this.ConstructorExampleId = obj.ConstructorExampleId;
		this.ConstructorExampleName = obj.ConstructorExampleName;
	}
	
	// member functions
	public void displayDetails() {
		System.out.println("ConstructorExample ID: " + this.ConstructorExampleId);
		System.out.println("ConstructorExample Name: " + this.ConstructorExampleName + "\n");
	}
}

public class ConstructorsExample {

	public static void main(String[] args) {
		ConstructorExample obj1 = new ConstructorExample();
		obj1.displayDetails();
		
		ConstructorExample obj2 = new ConstructorExample(102,"John Smith");
		obj2.displayDetails();
	
		ConstructorExample obj3 = new ConstructorExample();
		obj3.ConstructorExampleId = obj2.ConstructorExampleId;
		obj3.ConstructorExampleName = obj2.ConstructorExampleName;
		obj3.displayDetails();
		
		ConstructorExample obj4 = new ConstructorExample(obj2);
		obj4.displayDetails();
		
		/*
		 * l1: { System.out.println(obj1.hashCode());
		 * System.out.println(obj2.hashCode()); }
		 */
	}

}
