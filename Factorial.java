package com.pratice;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter values");
		int number =scanner.nextInt();
		int mult=1;
		for(int i=1;i<=number;i++) {
			mult=mult*i;
			System.out.println(mult);
		}
	}

}
