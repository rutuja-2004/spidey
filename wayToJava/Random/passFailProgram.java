import java.util.Scanner;
class passFailProgram{
	public static void main(String[]args)
	{
       Scanner sc = new Scanner(System.in);

       float marks = 457f;
       float total = 600f;
       float percent =(marks/total)*100;
       String result = (percent>=35||percent<=35)?("you are pass"):("you are failed");
       System.out.println(result);
	}
}