import java.util.Scanner;
class minutesToYearsDays
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number or minutes : ");

		long minutes = sc.nextLong();
		long years = minutes/(60*24*365);
		long remainingMinutes = minutes%(60*24*365);
		long days = remainingMinutes/(60*24);

		System.out.println(minutes+"minutes is apporoximately : "+years+" years and "+ days+" days");


		
	}
}