import java.util.Scanner;

public class Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
// 		Below is a single threaded program
		// when there is multiple subclass, do not use single threaded
		
		
//		Banking program
		System.out.println("Banking activity has started");
		
		System.out.println("Enter account number");
		int an = sc.nextInt();
		System.out.println("Enter password");
		int pw = sc.nextInt();
		System.out.println("Collect your money");
		
		System.out.println("Banking activity has completed");
		
		
//		Printing program
		System.out.println("Printing activity has started");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Printing");
			
			try {
				Thread.sleep(2000); // checked exception
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Printing activity has completed");
		
		
//		Addition program		
		System.out.println("Addition activity has started");
		
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		
		System.out.println("Addition activity has ended");
	}

}
