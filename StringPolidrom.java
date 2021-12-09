package com.techno.strings;

public class StringPolidrom {
	public static void main(String[] args) {
		String a ="mom";
		String s=a;
		
		String b="";
		for(int i=0;i<a.length();i++) {
			b=a.charAt(i)+b;
		}
		System.out.println(b);
		if(s.equals(b)) {
			System.out.println("is ployndrome");
		}
		else {
			System.out.println("is not polyndrome");
		}
		
	}
}
	
	


