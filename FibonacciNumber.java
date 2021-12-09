package com.pratice;
//import java.util.Scanner;
public class FibonacciNumber {
	public static void main(String[] args) {
		/*Scanner scanner =new Scanner(System.in);
		System.out.println("enter values");
		int number =scanner.nextInt();*/
		int n1=0;
		int n2=1;
		System.out.println("fibnonacci number");
		//System.out.println(n1+" "+n2);
		for(int i=1;i<=10;i++) {
			int n3=n1+n2;
			System.out.print( " "+n3 );
			n1=n2;
			n2=n3;
		}
		
	}

}
