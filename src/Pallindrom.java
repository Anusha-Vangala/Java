
import java.util.Scanner;

class Pallindrom{  
 public static void main(String args[])
 {
	 int sum=0,temp,r;
	 Scanner scan= new Scanner(System.in);
	 System.out.println("enter a num");
	 int num = scan.nextInt();
	 scan.close();
	 temp=num;
	 while(num > 0)
	 {
		 r=num%10;
		 sum=(sum*10)+r;
		 num=num/10;
	 }
	 if(temp==sum)
		 System.out.println("pall");
	 else
		 System.out.println("not pall");
		 
	 }
 }