import java.util.Scanner;
class MakeNoPrime
{
	public static void main(String[] args)
	{	
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		boolean flag = true;
		for(int i = 2; i<num; i++)
		{
			if(num%i==0)
			{
				flag = false;
				num++;
				i=2;
			}
		}
		System.out.println("The Prime num : "+num);
	}
	
}