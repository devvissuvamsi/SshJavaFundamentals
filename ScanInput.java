import java.util.Scanner;

public class ScanInput {
	public static void main(String[] args) {
		String name;
		int age;
		char gender;
		long contactno;
		double salary;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		name = scan.nextLine();
		System.out.println("Enter your age");
		age = scan.nextInt();
		System.out.println("Enter your gender");
		gender = scan.next().charAt(0);
		System.out.println("Enter your contactno");
		contactno = scan.nextLong();
		System.out.println("Enter your salary");
		salary = scan.nextDouble();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(contactno);
		System.out.println(salary);
	}
}
