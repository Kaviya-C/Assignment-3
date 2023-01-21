import java.util.Scanner;
public class Month_How_Many_Days {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number from 1-January to 12-December");
		int month=sc.nextInt();
		
		System.out.println("Enter the year: ");
		int year=sc.nextInt();

		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days in this "+month);
			break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days in this month of "+month);
			break;	
		
		case 2:
		
			if((year%400==0) || ((year%4==0)&& (year%100!=0)))
			{ 
				System.out.println("leap year: "+year);
			System.out.println("Only 29 days in a month");
			}
			else 
			{
				System.out.println("Not a leap year"+year);
				System.out.println("only 28 days in a month");
				
			}
		
		break;
		
		default:
			System.out.println("Please enter the number from 1 to 12 only ..!");
			break;
		}
		 sc.close();
	}
}