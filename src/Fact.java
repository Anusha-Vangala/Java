
import java.util.Scanner;

public class Fact 
{

	public static void main(String[] args)
	{
		int fact = 1;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a num");
		int num = scan.nextInt();
		scan.close();
		for(int i=1;i <= num; i++)
			fact = fact*i;
		System.out.println("the fact of num " +num+ "is:"+fact);
		
	}


}
