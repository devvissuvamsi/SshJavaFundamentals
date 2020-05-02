import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// Shortcuts.keyBoardShortCuts();

		 /*	byte num1 = 100,num2 = 100;
		byte num3 = (byte) (num1 + num2);
		
		System.out.println(num3);*/
		
		String name;
		System.out.print("Enter your name:");
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
		
		System.out.println(name);
	}
}
