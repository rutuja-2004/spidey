import java.util.Scanner;

class computingBMI
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Weight in Punds: ");
		double weight = sc.nextDouble();
		System.out.println("Enter Your Height in inches: ");
		double height = sc.nextDouble();

		double weightKg = weight*0.45359237;
		double heightM =  height/39.37;
  
		double bmi = weightKg/(heightM*heightM);
		System.out.println("BMI is: "+ bmi);
	}
}