
public class BoxingAndUnBoxing {
	public static void main(String[] args) {
		// Autoboxing or Boxing, converting primitive types to object
		int num = 100;
		Integer obj = Integer.valueOf(num); // Explicit boxing
		Integer obj1 = num; // Implicit auto boxing
		
		System.out.println(obj);
		System.out.println(obj1);
		
		// Unboxing 
		Integer obj2 = new Integer(200);
		int num1 = obj2.intValue(); // explicit unboxing
		int num2 = obj2; // implicit unboxing 
		System.out.println(num1);
		System.out.println(num2);
		
		
	}
}
