
import java.util.Scanner;
public class Eodd {
	public static void main(String args[])
	{
	Scanner scan= new Scanner(System.in);
	System.out.println("enter a num");
	int num= scan.nextInt();
	scan.close();
	if(num%2==0)
	System.out.println("is even");
	else
		System.out.println("is odd");
	}
}
	
	


