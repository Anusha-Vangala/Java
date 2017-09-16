
import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a num");
		int num = scan.nextInt();
		scan.close();
		for(int i=1;i<num;i++)
			if(num%i==0)
			{
		     count++;
			}
		     if(count == 1)
		     System.out.println("prime");
		     else
		    	 System.out.println("is not prime");
		   }
}