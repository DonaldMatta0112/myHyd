package com.techno.store;
import java.util.Scanner;
public class NewStorMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input");
		int i = scanner.nextInt();
		switch(i) {
		case 1:
			NewStore.add();
			NewStore.menu();
		case 2:
			NewStore.view();
			NewStore.menu();
		case 3:
			NewStore.remove();
			NewStore.menu();
		case 4:
			NewStore.modify();
			NewStore.menu();
		}
	}

}
