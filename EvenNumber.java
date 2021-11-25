package techno.pratice;
import java.util.Scanner;
public class EvenNumber {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter values");
	System.out.println("Enter x values");
	int x=scanner.nextInt();
	System.out.println("Enter y values");
	int y=scanner.nextInt();
	 System.out.println("even number between"+x+"and"+y+"are:");{
		 for(int i=1;i<=10;i++)
		 if(i%2==0) {
			 System.out.println(i+"are even numbers");
		 }
	 }
		
	
}
}
