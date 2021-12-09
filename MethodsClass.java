package com.techno.store;
import java.util.ArrayList;
import java.util.Scanner;
public class MethodsClass {
	Scanner scanner =new Scanner(System.in);
public static ArrayList al=new ArrayList();
public static void add() {
	al.add("Rice");
	al.add("Dal");
	al.add("Fruits");
	al.add("Books");
	al.add("pens");
}
public static void view() {
	for(Object obj:al) {
		System.out.println(obj);
	}
}
public static void modify() {
	for(Object obj:al) {
		System.out.println(obj);
	}	
}
public static void remove(int a) {
	System.out.println(al.remove(a));
}

 
}
