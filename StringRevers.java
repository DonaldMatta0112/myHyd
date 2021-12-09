package com.techno.strings;

public class StringRevers {
	public static void main(String[] args) {
		System.out.println("hii");
		String a="hibro";
		String b="";
		for(int i=0;i<a.length();i++) {
			b=a.charAt(i)+b;
		}
		System.out.println(b);
	
	}

}
