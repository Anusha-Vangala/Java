
import java.util.Scanner;
public class Hellojava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
