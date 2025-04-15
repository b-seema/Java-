package learningJava;

import java.util.Scanner;

public class MethodUse {

	public static void main(String[] args) {
		
	
		MethodUse obj = new MethodUse();
		
		Scanner scan = new Scanner (System.in);
		System.out.println("enter 1 int");
		int a=scan.nextInt();
		
		System.out.println("enter 2 int");
		int b=scan.nextInt();
		
		int result=obj.addingtwonumbers(a,b);
		obj.printresult(result);

	}

	
	public int addingtwonumbers (int a, int b ) {
		int sum = a+ b;
		return sum;
	}
	
	public void printresult(int a)
	{
		System.out.println(a);
	}
}
