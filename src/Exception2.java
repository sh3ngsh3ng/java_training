import java.util.Scanner;

class ExceptionDemo {
	void demo() throws ArithmeticException {
		System.out.println("Connection established");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a = sc.nextInt();
			System.out.println("Enter the denominator");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println("Handled in demo method");
			throw e;
		}
		System.out.println("Connection terminated");
	}
}


public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo dm = new ExceptionDemo();
		try {
			dm.demo();
		}
		catch (ArithmeticException e) {
			System.out.println("Handled in main method");
		}
	}

}
