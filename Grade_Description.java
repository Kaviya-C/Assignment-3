import java.util.Scanner;
public class Grade_Description {
	public static void main(String[] args) 
	{
		System.out.println("The accepted grade : options are A, V, E, G, F please enter in capital format..!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the grade: ");
		char grade=sc.next().charAt(0);

		switch(grade)
		{
		case 'E':
		{
			System.out.println("Excellent");
			break;
		}
		case 'V':
		{
			System.out.println("Very Good");
			break;
		}
		case 'G':
		{
			System.out.println("Good");
			break;
		}
		case 'A':
		{
			System.out.println("Average");
			break;
		}
		case 'F':
		{
			System.out.println("Fail");
			break;
		}
		default:
			System.out.println("Please enter the grade which i display in above options..");
			break;
		}
		 sc.close();

	}
}
