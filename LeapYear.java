package com.pratice;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the year ");
		for(int i=0;i<=4;i++) {
		int year=scanner.nextInt();
			if(((year%4==0)&&(year%100!=0))||(year%400==0)){
				System.out.println("is leap year");
			}else {
				System.out.println("is not leap year");
			}
		
		}
	}

}
