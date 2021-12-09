package com.techno.store;
import java.util.Scanner;
import java.util.ArrayList;
public class NewStore {
static Scanner scanner=new Scanner(System.in);
static ArrayList al=new ArrayList();
	public static void add() {
		System.out.println("Enter the product name");
		System.out.println("Enter the size ");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			al.add(scanner.next());
			
		}
		System.out.println(":::::::::::::::::::::::::::");
	}
	public static void view() {
		for(int i =0;i<al.size();i++) {
			System.out.println(al);
			}
		System.out.println("::::::::::::::");
	}
	public static void remove() {
		System.out.println("Enter the value to be remove");
		String str=scanner.next();
		al.remove(str);
		System.out.println(al);
		System.out.println("::::::::::::::::::::");
	}
	public static void modify() {
		System.out.println("Enter the old item ");
		String old=scanner.next();
		System.out.println("Enter the new item ");
		String str1 =scanner.next();
		String print=repalce(old,str1);
		System.out.println(print);
	}
	private static String repalce(String old, String str1) {
		// TODO Auto-generated method stub
		return null;
	}
  
	public static void menu() {
		System.out.println("Enter Your Choices");
		System.out.println("Enter 1 to add");
		System.out.println("Enter 2 to view");
		System.out.println("Enter 3 to modify");
		System.out.println("Enter 4 to remove");
	}

}
