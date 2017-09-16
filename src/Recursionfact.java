

import java.util.Scanner;

public class Recursionfact {

 
	 static int factorial(int n){    
	  if (n == 0)    
	    return 1;    
	  else    
	    return(n * factorial(n-1));    
	 }  
	 
	 
	 
	 public static void main(String args[]){  	
	  int number,fact=1;  
	  
	  Scanner scan=new Scanner(System.in);
	  System.out.println("enter the num");
	  number=scan.nextInt();
	  scan.close();
	  	  
	  
	  fact = factorial(number);   
	  System.out.println("Factorial of "+number+" is: "+fact); 
	  
	  
	  
	 }  
	}  
