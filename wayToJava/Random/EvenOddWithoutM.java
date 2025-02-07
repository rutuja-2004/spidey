import java.util.Scanner;
class EvenOddWithoutM
{
	//check the even odd no without modulous
	public static void main(String[] args)
	{
		System.out.println("Enter the num: ");
		int num = new Scanner(System.in).nextInt();
		System.out.println(num/2==num/2.0);

		System.out.println("Enter the 2nd num: ");
		int num2 = new Scanner(System.in).nextInt();
		System.out.println((num2/2)*2==num2);


	}
}