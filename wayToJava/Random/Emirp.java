import java.util.Scanner;
class Emirp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int dup = num;

		int rev = 0;
		boolean flag = true;
		
		outerLoop:
		for(int m = 0; m<=1; m++)
		{
			for(int den=2; den<num; den++)
			{
				if(num%den == 0)
				{
					System.out.println(num+" is Not Prime or Emirp  ");
					flag = false;
					break outerLoop;
				}
			}
			if(flag)
			{
				System.out.println(num+" is prime");
				for(int i=num; i>0; i/=10)
				{
					int rem = i%10;
					rev = rev*10+rem;
				}
				num=rev;
				if(m==1)
				{
					System.out.println("The Number is Emirp ");
				}
			}
		}

	}
}