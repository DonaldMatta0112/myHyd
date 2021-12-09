package com.pratice;
import java.util.Scanner;
public class ReversOrder {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	     System.out.println("enter values");
	     int number =scanner.nextInt();
	     int rev=0;
	     while(number>0) {
	    	 int rem =number%10;
	    	 rev=rev*10+rem;
	    	 number=number/10;
	    	// System.out.println(rev);
	     }
	     System.out.println(rev);
	}

}
