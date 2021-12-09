package com.pratice;
import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter values");
		int number =scanner.nextInt();
		int num=number;
		int sum=0;
		//int fact=1;
		while(number>0) {
			int fact=1;
			int rem=number%10;
			int i=rem;
			while(i>0&&i<=number) {
				fact=fact*i;
				i--;
			}
			sum=sum+fact;
			number=number/10;
			
		}
		if(sum==num) {
			System.out.println(num+"is a strong number");
		}
		else {
			System.out.println(num+"is not astrong number");
		}
	}

}
