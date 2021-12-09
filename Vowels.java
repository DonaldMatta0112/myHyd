package com.techno.strings;

public class Vowels {
	public static void main(String[] args) {
		int count=0;
		String s="donald";
		for(int i=0;i<s.length();i++) {
			char b=s.charAt(i);
			if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
				System.out.println(b);
				count++;
				
				
			}
		}
		System.out.println(count);
	}

}
