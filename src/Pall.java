

import java.util.Scanner;


public class Pall {

	public static void main(String[] args) {
	int num;
	boolean flag=true;
	Scanner scan = new Scanner(System.in);
	num = scan.nextInt();
	scan.close();
	System.out.println("the given input is"+num);
	for(int i=2; i < num; i++)
	{
		if( num%i == 0 )
		{
			flag=false;
		}		
	
	}
	if (flag)
	{
		System.out.println(" prime");

	}
	else
	{
		System.out.println("not prime");
	}
	
	
	
	
	
	
	
	}

}
