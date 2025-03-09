package learningJava;

import java.util.Scanner;

public class FirstJavaProgram {

	public static void main(String[] args) {
		System.out.println("Hello");
		int a=2;
		int b=34;
		int sum = a+b;
		
		System.out.println(sum);
		System.out.println("Now perform addition by user interaction");
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Enter the digit");
		int first_digit= scanner.nextInt();
		int second_digit=scanner.nextInt();
		double sum1= first_digit+ second_digit;
		System.out.println("Here is result ="+ sum1);
		
		

	
	}
	

}
