package techno.pratice;
import java.util.Scanner;
public class DisByTwoNumb {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter range of numbers");
		System.out.println("Enyer  value of x");
		int x=scanner.nextInt();
		System.out.println("Enyer  value of y");
		int y=scanner.nextInt();
		System.out.println("Enter the divider number");
		System.out.println("Enter first divider number");
		int divider1=scanner.nextInt();
		System.out.println("Enter second divider number");
		int divider2=scanner.nextInt();
		System.out.println("number divisible by"+divider1+"and"+divider2+"between"+x+"and"+y+"are :");
		for(int i=x;i<=y;i++) {
			if(i%divider1==0&&i%divider2==0) {
				System.out.println(i);
			}
		}
	}

}
