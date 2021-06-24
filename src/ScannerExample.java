import java.util.Scanner;
public class ScannerExample {
	public static void main(String args[]) {
		Scanner std=new Scanner(System.in);
		int id =std.nextInt();
		System.out.println("enter the student details");
		String name= std.nextLine();
		
		
		
		System.out.println("enter the school details");
		String school=std.nextLine();
		
		System.out.println("student name:" + name);
		System.out.println("student id:" + id);
		System.out.println("student school:" + school);
		
	}

}
