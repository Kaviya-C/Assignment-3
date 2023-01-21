/*Test Data :
Input the Roll Number of the student :784
Input the Name of the Student :James
Input the marks of Physics, Chemistry and Computer Application : 70 80 90
Expected Output :
Roll No : 784
Name of Student : James
Marks in Physics : 70
Marks in Chemistry : 80
Marks in Computer Application : 90
Total Marks = 240
Percentage = 80.00
Division = First*/
import java.util.Scanner;
public class Total_Percentage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String div="First";
		System.out.println("Enter the roll no of the student: ");
		int roll_no=sc.nextInt();
		System.out.println("Enter the name of the student: ");
		String name=sc.next();
		System.out.println("Enter the Physics marks: ");
		int physics=sc.nextInt();
		System.out.println("Enter the Chemistry marks: ");
		int chemistry=sc.nextInt();
		System.out.println("Enter the Computer Application marks: ");
		int computer=sc.nextInt();
		System.out.println("Roll No: "+roll_no);
		System.out.println("Name of the Student: "+name);
		System.out.println("Marks in Physics: "+physics);
		System.out.println("Marks in Chemistry: "+chemistry);
		System.out.println("Marks in Computer Application: "+computer);
		int total=physics+chemistry+computer;
		float percentage=(total/3);
		System.out.println("Total Mark = "+total);
		System.out.println("Percentage = "+percentage);
		System.out.println("Division = "+div);
		
		 sc.close();
		
	}

}




