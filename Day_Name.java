import java.util.Scanner;
public class Day_Name {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number from 1 to 7: ");
		int day_num=sc.nextInt();
		
		if(day_num==1) {
			System.out.println("Sunday");
		}
		else if(day_num==2) {
			System.out.println("Monday");
		}
		else if(day_num==3) {
			System.out.println("Tuesday");
		}
		else if(day_num==4) {
			System.out.println("Wednesday");
		}
		else if(day_num==5) {
			System.out.println("Thursday");
		}
		else if(day_num==6) {
			System.out.println("Friday");
		}
		else if(day_num==7) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Alowed numbers from 1 to 7 only");
		}
		 sc.close();
		 
	}
	
}
