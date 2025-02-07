
import java.util.Scanner;
class celsiusToFarenheit
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a degree in celsius : ");
	double celsius = input.nextDouble();
	double farenheit = (9.0/5)*celsius+32;
	System.out.println(celsius+" celsius is : "+farenheit+" farenheit");
	
}
}