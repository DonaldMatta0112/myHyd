package com.pratice;
import java.util.Scanner;
public class SpyNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter values");
	int number =scanner.nextInt();
	int num=number;
	int sum=0;
	int prod=1;
	while(number>0) {
		int rem=number%10;
		sum=sum+rem;
		prod=prod*rem;
		number=number/10;
	}
	if(sum==prod) {
		System.out.println(num +"given number is spy");
	}
	else {
		System.out.println(num +"given number is not spy");
	}
}
}
