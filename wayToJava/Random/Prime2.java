import java.util.Scanner;
class Prime2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int dup = num;

		int rev = 0;
		boolean flag = true;
		
		
			for(int den=2; den<num; den++)
			{
				if(num%den == 0)
				{
					System.out.println(num+" is Not Prime or Emirp  ");
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(num+" is prime");				
			}
		
	}
}