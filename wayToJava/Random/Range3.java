import java.util.Scanner;
class Range3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		int op = ((num%2==0)&&(num%5==0))?("Hii two HiiFive"):((num%2==0)?("Hii Two")):((num%5==0)?("Hii Five"):("_"));
		System.out.println(op);
		
	}
}