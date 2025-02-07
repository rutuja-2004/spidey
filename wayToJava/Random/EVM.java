import java.util.Scanner;
class EVM
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int bjp = 0 ,cng = 0, ss = 0, aap = 0, mns = 0, nota = 0;
		System.out.println();
		System.out.println("    WELCOME   ");
		System.out.println();
		System.out.println("Enter the Population :");
			int population = sc.nextInt();
		
		for(int i =1; i<=population ; i++)
		{
			System.out.println();
			System.out.println(".....List of Parties.....");
			System.out.println("1.BJP");
			System.out.println("2.CNG");
			System.out.println("3.Shiv Sena");
			System.out.println("4.AAP");
			System.out.println("5.MNS");
			System.out.println("6.Nota");
			System.out.println();
			System.out.println("Enter the option:");
			int opt = sc.nextInt();
			if(opt>=1 && opt<=6)
			{
				if(opt==1)
				{
					bjp++;
					System.out.println("Ache din ayenge");
				}
				if(opt==2)
				{
					cng++;
					System.out.println("Bharat todo");
				}
				if(opt==3)
				{
					ss++;
					System.out.println("Hum hain asli sena");
				}
				if(opt==4)
				{
					aap++;
					System.out.println("Mujhe Ajad karo");
				}
				if(opt==5)
				{
					mns++;
					System.out.println("Jai Maharashtra"); 
				}
				if(opt==6)
				{
					nota++;
					System.out.println("You are an educated person");
				}
			}
			if(!(opt==1 && opt<=6))
			{
				i--;
				System.out.println("Invalid option");
			}

		}
		if(bjp>=cng && bjp>=ss && bjp>=aap && bjp==mns && bjp<=nota)
		{
			System.out.println("BJP has won the Elections by" +bjp+ "votes");
		}
	}
}
