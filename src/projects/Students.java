package projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Students {
	
	private static int id=1000;
	private String studentId;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses="";
	private static int costOfCourse= 600;
	private int tuitionBalance ;
	
	
	public void setStudentId() {
		id++;
		this.studentId = gradeYear + ""+id;
	}
	
	public Students() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter student's first name");
		this.firstName=scan.nextLine();
		
		System.out.println("Enter student's last name");
		this.lastName=scan.nextLine();
		
		System.out.println("Enter student's class level");
		System.out.println("1-Freshmen");
		System.out.println("2-Sophmore");
		System.out.println("3-Junior");
		System.out.println("4-Senior");
		this.gradeYear=scan.nextInt();
		
		setStudentId();
		
		
	}
	public void enroll() {
		do {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter course to enroll (Q to quit)");
			String course =scan.nextLine();
			
			if(!course.equals("Q")) {
				courses=courses+"\n"+course;
				tuitionBalance= tuitionBalance+	costOfCourse;
				
			}else {
				break;
			}
			
			
		}while(true);
		System.out.println("Enrolled in : "+courses);
			
	}
	
	public void payTuition() {
		System.out.println("Your balance : $"+tuitionBalance);
		Scanner scan=new Scanner(System.in);
		System.out.println("How much do you want to pay");
		int payment=scan.nextInt();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("Thanks for payment of $"+payment);
		System.out.println("Your balance : $"+tuitionBalance);
	}
	
	public String toString() {
	return	"STUDENT ID: "+studentId+
		"\nSTUDENT NAME: "+firstName+" "+lastName+
		"\nGRADE LEVEL: "+gradeYear+
		"\nCOURSES ENROLLED: "+courses+
		"\nREMAINING BALANCE: "+tuitionBalance;
		
	}
	static Map<String,String> studentInfo=new HashMap<>();
	public static void addStudentsToMap() {
		Scanner scan =new Scanner(System.in);
		String stop="";
		
		while(!stop.equals("S")) {
			Students s =new Students();
			s.enroll();
			s.payTuition();
			
			studentInfo.put(s.studentId,s.toString());
			System.out.println("Press 'S' to stop entrance");
			System.out.println("Press Enter to go on entrance");
			stop=scan.nextLine();
			
		}
		
		//select options methodu lazim
	}
	public static void getStudentsInfo() {
		Scanner scan =new Scanner(System.in);
		String idOfStudent="";
		String result="";
		do {
			System.out.println("Enter student id to get information");
			System.out.println("Enter 'X' to end the program");
			idOfStudent=scan.nextLine();
			result=studentInfo.get(idOfStudent);
			if(!idOfStudent.equals("X")) {
				System.out.println(result);
				
			}
			
		}while(!idOfStudent.equals("X"));
		//select options methodu lazim
	}

}
