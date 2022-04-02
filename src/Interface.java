import java.util.Scanner;

// An interface is a completely "abbstract class" that is used to group related
// methods with empty bodies
interface Calculator {
	void add(); // public, abstract
	void subtract();
	void multiply();
	void divide();
}

interface Calculator2 {
	int count = 3;
	void special();
}

class Calculator3 {
	void add() {
		System.out.println(10 + 20);
	};
}

class Calculator4 extends Calculator3 implements Calculator2 {
	public void special() {
		System.out.println("This is the special method");
	}
	public void display() {
		System.out.println(count);
	}
}

class MyCalculator1 implements Calculator, Calculator2 {
//	void add() { // default if no access specifier specified
//		int a = 10;
//		int b = 20;
//		int c = a + b;
//		System.out.println(c);
//	}
	public void add() { // default if no access specifier specified
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	
	public void subtract() {
		int a = 10;
		int b = 20;
		int c = b - a;
		System.out.println(c);
	}
	
	public void multiply() {
		int a = 10;
		int b = 20;
		int c = b * a;
		System.out.println(c);
	}
	
	public void divide() {
		int a = 10;
		int b = 20;
		int c = b / a;
		System.out.println(c);
	}
	public void special() {
		System.out.println("Special");
	}
}

class MyCalculator2 implements Calculator {
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNum = sc.nextInt();
		System.out.println("Enter the second number");
		int secondNum = sc.nextInt();
		int result = firstNum + secondNum;
		System.out.println(result);
	}
	public void subtract() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNum = sc.nextInt();
		System.out.println("Enter the second number");
		int secondNum = sc.nextInt();
		int result = firstNum - secondNum;
		System.out.println(result);
	}
	public void multiply() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNum = sc.nextInt();
		System.out.println("Enter the second number");
		int secondNum = sc.nextInt();
		int result = firstNum * secondNum;
		System.out.println(result);
	}
	public void divide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNum = sc.nextInt();
		System.out.println("Enter the second number");
		int secondNum = sc.nextInt();
		int result = firstNum / secondNum;
		System.out.println(result);
	}
}


class Geometry {
	void allow(Calculator ref) {
		ref.add();
		ref.subtract();
	}
}



public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator1 mc1 = new MyCalculator1();
		MyCalculator2 mc2 = new MyCalculator2();
		Geometry g = new Geometry();
		
//		g.allow(mc1);
//		g.allow(mc2);
		
		Calculator3 c4 = new Calculator4();
		c4.add();
		((Calculator2) c4).special();
		((Calculator4) c4).display();
	}

}
