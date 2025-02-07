
import java.util.Scanner;
class smallestNo
{
	public static void main(String[] args)
	{
		int a, b, c, largest;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first no : ");
		a = sc.nextInt();

		System.out.println("Enter the second no : ");
		b = sc.nextInt();

		System.out.println("Enter the third no : ");
		c = sc.nextInt();

		largest = c<(a<b?a:b)?c:((a<b)?a:b);

		System.out.println("The smallest number is "+ largest);
		
	}
}