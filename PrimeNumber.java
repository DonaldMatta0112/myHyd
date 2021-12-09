package com.pratice;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter values");
		int number =scanner.nextInt();
		int count=0;
		for(int i=2;i<=number;i++) {
			//int count=0;
			if(number%i==0) {
				count++;
			}
		}
		
			if(count<2) {
				System.out.println(number+"is a prime number");
			}
			else {
				System.out.println(number+"is not a prime number");
			}
		
			
		
	}

}
