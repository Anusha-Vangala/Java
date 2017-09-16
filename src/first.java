

import java.util.Scanner;
class first
{
   public static void main(String args[])
   {		
	   int count =0;
	   Scanner scan = new Scanner(System.in);
	   System.out.println("enter the number");
	   int num = scan.nextInt();
	   scan.close();
	   for(int i = 1;i<= num;i++)
		   
	   {
		   if(num%i==0)
			   count++;
	   }
		   if(count == 2)
			   System.out.println("is prime");
		   else
			   System.out.println("is not prime");		   
	   }
   }
