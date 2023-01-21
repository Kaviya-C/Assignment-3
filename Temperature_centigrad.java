import java.util.Scanner;
public class Temperature_centigrad {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature: ");
		int temperature=sc.nextInt();
		if (temperature<=20){
			System.out.println("Very Cold!..Freezing....!Need blankets immediatetly");
		}
		else if(temperature>=21&&temperature<=30) {
			System.out.println("Normal Weather! I can manage");
		}
		else if(temperature>=31&&temperature<=40) {
			System.out.println("Weather is warm");
		}
		else if(temperature>40) {
			System.out.println("Weather is too hot! need some cool water");
		}
		 sc.close();
	}

}


