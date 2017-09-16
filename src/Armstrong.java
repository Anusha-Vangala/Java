
import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		int sum=0,temp,r;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num");
		int num = scan.nextInt();
		scan.close();
		temp=num;
		while(num > 0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		if(temp == sum)
		{System.out.println("arm");
		}
		else
		{
			System.out.println("not arm");
		}
	}
}
