import java.util.Scanner;

class vowel
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Alphabets : ");
		char ch = sc.next().charAt();
		char ch = (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u' ||ch == 'I' || ch == 'i' );
		System.out.println(ch);
	}
}