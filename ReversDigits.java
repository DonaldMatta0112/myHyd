package com.pratice;
import java.util.Scanner;
public class ReversDigits {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter values");
		int number =scanner.nextInt();
		while(number>0) {
			int rem=number%10;
			System.out.println(rem);
			number=number/10;
		}
	}

}
