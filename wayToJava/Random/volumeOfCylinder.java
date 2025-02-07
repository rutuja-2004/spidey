
import java.util.Scanner;
class volumeOfCylinder
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius and height of a cylinder : ");

		double radius = input.nextDouble();
		double height = input.nextDouble();

		double area = 3.14*radius*radius;
		double volume = area*height;

		System.out.println("The area is : "+area);
		System.out.println("The volume is :"+volume);

		
	}

}