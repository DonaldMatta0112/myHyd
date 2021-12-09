package com.techno.strings;

public class CharaterPresent {
	public static void main(String[] args) {
		int count=0;
		String s="donald";
		char me='d';
		for(int i=0;i<s.length();i++) {
			char a=s.charAt(i);
			if(a==me) {
				count++;
				//System.out.println(count);
			}
	}  
		if(count>0) {
			System.out.println(me);
			
		}else {
			System.out.println("is not present");
		}
		
	}
}
