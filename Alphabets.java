package techno.pratice;
import java.util.Scanner;
public class Alphabets {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("ENTER ALPHABETS");
		char alphabets=scanner.next().charAt(0);
		if((alphabets>='a')&&(alphabets<='z')) {
			System.out.println("the entered alphabets is in lowerCase");
		}
		else if((alphabets>='A')&&(alphabets <='z')) {
			System.out.println("the entered alphabets is in upperCase");
		}
		else {
			System.out.println("invalid Alphabets");
		}
	}

}
