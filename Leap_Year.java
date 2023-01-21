import java.util.Scanner;
public class Leap_Year {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=input.nextInt();

		if((year%400==0) || ((year%4==0)&& (year%100!=0))){ 
			System.out.println("leap year: "+year);
		}
		else
			System.out.println("Not a leap year "+year);
		 input.close();
	}
}


