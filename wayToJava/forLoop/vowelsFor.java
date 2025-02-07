
import java.util.Scanner;
class vowelsFor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String un = sc.next().toUpperCase();
		int len = un.length();
		for(int i = 0; i<len; i++)
		{
			if(un.charAt(i)=='A' || un.charAt(i)=='E' || un.charAt(i)=='I'  || un.charAt(i)=='O'  || un.charAt(i)=='U' )
			{
				System.out.print(un.charAt(i));
			}
	
		}	
	}
}