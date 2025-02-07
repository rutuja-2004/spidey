
import java.util.Scanner;
class productofD
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");

		int num = sc.nextInt();
		int product = 1;

		while(num>0)
		{
			int digit = num % 10;
			product *=(digit!=0)?digit:1;
			num /= 10;

		}	
		System.out.println("product of digit : "+product);
	}
	
}