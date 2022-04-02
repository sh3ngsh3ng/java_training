import java.util.Scanner;

class Branch {
	int age;
	Scanner sc = new Scanner(System.in);
	void requestAge() {
		System.out.println("Enter your age");
		age = sc.nextInt();
	}
	
	void checkAge() {
		if (age < 18) {
			System.out.println("You need to be above 18.");
		} else {
			System.out.println("Proceed on");
		}
	}
}

class TP {
	void initiate() {
		Branch b = new Branch();
		b.requestAge();
		b.checkAge();
	}
}


public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TP tp = new TP();
		tp.initiate();
	}

}
