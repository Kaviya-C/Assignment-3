import java.util.Scanner;
public class Alpha_Digit_SpecialCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character: ");
		char character=sc.next().charAt(0);
		
		if ((character>='A' && character<='Z')||(character>='a' && character<='z')) {
			System.out.println(character+" is alphabet");	
		}
		else if(character>='0' &&character<='9') 
		{
			System.out.println(character+" is digit");
		}
		else 
		{		
			System.out.println( character+" is Special Character");
			
		}
		sc.close();
	}

}
