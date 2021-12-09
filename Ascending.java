package techno.pratice;
import java.util.Scanner;

public class Ascending {
 
		public static void main(String[] args) {
			Scanner scr = new Scanner(System.in);
			System.out.println("Enter values");
			int a=scr.nextInt();
	            int [] array = new int[a];
	            int temp;
	            for(int i =0; i<array.length;i++)
	            {
	            	 for(int j = i; j < array.length;j++)
	            	 {
	            		 if(array[i] > array[j])
	            		 {
	            		    temp = array[i];
	            		    array[i] = array[j];
	            		    array[j] = temp;
	            		   
	            		 }
	            	 } 
	            }
	            for(int i = 0; i < array.length;i++)
	            {
	            System.out.println(array[i]);
	            }
	}
	}
	


