import java.util.Scanner;

class Student1 {
	// data members
	int studentId; String studentName;
	
	public void acceptDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		this.studentName = scan.nextLine();
		System.out.print("Enter your id: ");
		this.studentId = scan.nextInt();
	}
	
	// member functions
	public void displayDetails() {
		System.out.println("Student ID: " + this.studentId);
		System.out.println("Student Name: " + this.studentName);
	}	
}

class Marks extends Student1 {
	protected float subjectiveMarks;
	protected float objectiveMarks;
	
	public void acceptDetails() {
		super.acceptDetails();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your subjective marks: ");
		this.subjectiveMarks = scan.nextFloat();
		System.out.print("Enter your objective marks: ");
		this.objectiveMarks = scan.nextFloat();
	}
	
	// member functions
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Subjective Marks: " + this.subjectiveMarks);
		System.out.println("Objective Marks : " + this.objectiveMarks);
	}	
}

class Sports extends Marks {
	float score;

	public void acceptDetails() {
		super.acceptDetails();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Score : ");
		this.score = scan.nextFloat();
	}
	
	// member functions
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Score : " + this.subjectiveMarks);
	}	
}

class Result extends Sports {
	float TotalMarks,AverageMarks;
	
	// member functions
	public void calculateResult() {
		this.TotalMarks = this.objectiveMarks + this.subjectiveMarks;
		this.AverageMarks = this.TotalMarks / 2;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Total Marks : " + this.TotalMarks);
		System.out.println("Average Marks : " + this.AverageMarks);
	}	

}
public class InheritanceExample {

	public static void main(String[] args) {
		Result s = new Result();
		s.acceptDetails();
		s.calculateResult();
		s.displayDetails();
		
	}

}
