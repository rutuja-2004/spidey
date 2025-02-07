class EevenOddsum
{
	public static void main(String[] args)
	{
		int num = 1234;
		int evensum = 0;
		int oddsum = 0;
		int sum = 0;
		int rem = num%10;

		sum = (rem%2==0)?(evensum=evensum+rem):(oddsum+rem);
		num = num/10;

		rem = num%10;
		sum = (rem%2==0)?(evensum=evensum+rem):(oddsum+rem);
		num = num/10;

		rem = num%10;
		sum = (rem%2==0)?(evensum=evensum+rem):(oddsum+rem);
		num = num/10;

		rem = num%10;
		sum = (rem%2==0)?(evensum=evensum+rem):(oddsum+rem);

		System.out.println("The sum of digits of no is :"+sum);


	}
}