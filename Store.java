package com.techno.store;
import java.util.Scanner;
public class Store {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		boolean flag=true;
		while(flag) {
		System.out.println("Enter choices");
		System.out.println("Enter 1 to add cart");
		System.out.println("Enter 2 to view all the elements in cart ");
		System.out.println("Enter 3 to modify the item in cart");
		System.out.println("Enter 4 to remove the cart");
		int number =scanner.nextInt();
		if(number==1) {
			System.out.println("Add Cart:");	
			MethodsClass.add();
		}
		else if(number==2) {
			System.out.println("Elements are:");
			MethodsClass.view();
		}
		else if(number==3) {
			System.out.println("enter your choice want to replace");
			MethodsClass.modify();
//			int n =scanner.nextInt();
//			MethodsClass.view();
//			int n1 =scanner.nextInt();
//			MethodsClass.al.set(n,n1);


		}
		else if(number==4) {
			System.out.println("Remove from ArrayList:");
			MethodsClass.remove(scanner.nextInt());
		}
		else {
			System.out.println("thank u for shopping");
			flag=false;
		}
		//System.out.println("quit button");
	}
	}
}
