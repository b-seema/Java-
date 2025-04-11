package learningJava;

import java.util.Scanner;

public class FirstJavaClass {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		System.out.println("Its my first programme");
		
		int a = 1;
		int b = 4;
		int sum = a+b;
		
		System.out.println(sum);
		Scanner obj = new Scanner(System.in);
		
		
		
		System.out.println("Enter value 1 - ");
		int num1 = obj.nextInt();
		
		System.out.println("Enter value 2 - ");
		int num2 =obj.nextInt();
			int result = num1 - num2 ;
			System.out.println("Result - " + result);
	}

}
