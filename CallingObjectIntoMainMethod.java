package learningJava;

public class CallingObjectIntoMainMethod {

	public static void main(String[] args) {
	
		CallingObjectIntoMainMethod obj = returnObject() ;
		obj.add(23, 33);
	}

	public static CallingObjectIntoMainMethod  returnObject() {
		CallingObjectIntoMainMethod t = new CallingObjectIntoMainMethod ();
		return t;
		}
	
	public void add(int a,int b ) {
		int sum = a + b;
		System.out.println("The sum of number" + sum);
		
	}
}
