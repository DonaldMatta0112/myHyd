package com.pratice;
import java.util.Scanner;
public class Palindrom {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter valiue");
		int number =scanner.nextInt();
		int num =number;
		int rev=0;
		while(number>0) {
			int rem =number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		if(num==rev) {
			System.out.println(num+"number is palindrom");
		}
		else {
			System.out.println(num+"number is not palindrom");
		}
	}

}
