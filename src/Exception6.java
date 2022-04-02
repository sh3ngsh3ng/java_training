import java.util.Scanner;
// multithread
// option 1: scheduler
//class Banking extends Thread {
//	public void run() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Banking activity has started");
//		
//		System.out.println("Enter account number");
//		int an = sc.nextInt();
//		System.out.println("Enter password");
//		int pw = sc.nextInt();
//		System.out.println("Collect your money");
//		
//		System.out.println("Banking activity has completed");
//	}
//}
//
//class Printing extends Thread {
//	public void run() {
//
//		System.out.println("Printing activity has started");
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Printing");
//			
//			try {
//				Thread.sleep(2000); // checked exception
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//		}
//		
//		System.out.println("Printing activity has completed");
//	}
//}
//
//class Adding extends Thread {
//	public void run() {
//
//		System.out.println("Addition activity has started");
//		
//		int a = 10;
//		int b = 20;
//		int c = a + b;
//		System.out.println(c);
//		
//		System.out.println("Addition activity has ended");
//	}
//}


// option 2
//class Banking implements Runnable {
//	public void run() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Banking activity has started");
//		
//		System.out.println("Enter account number");
//		int an = sc.nextInt();
//		System.out.println("Enter password");
//		int pw = sc.nextInt();
//		System.out.println("Collect your money");
//		
//		System.out.println("Banking activity has completed");
//	}
//}
//
//class Printing implements Runnable {
//	public void run() {
//
//		System.out.println("Printing activity has started");
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Printing");
//			
//			try {
//				Thread.sleep(2000); // checked exception
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//		}
//		
//		System.out.println("Printing activity has completed");
//	}
//}
//
//class Adding implements Runnable {
//	public void run() {
//
//		System.out.println("Addition activity has started");
//		
//		int a = 10;
//		int b = 20;
//		int c = a + b;
//		System.out.println(c);
//		
//		System.out.println("Addition activity has ended");
//	}
//}




//		Option 3
class Activities extends Thread {
	public void run() {
		if (getName().equals("BANK")) {
			banking();
		} else if (getName().equals("PRINT")) {
			printing();
		} else {
			adding();
		}
	};
	
	void banking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking activity has started");
		
		System.out.println("Enter account number");
		int an = sc.nextInt();
		System.out.println("Enter password");
		int pw = sc.nextInt();
		System.out.println("Collect your money");
		
		System.out.println("Banking activity has completed");
	}
	
	void printing() {

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
	}
	
	void adding() {

		System.out.println("Addition activity has started");
		
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		
		System.out.println("Addition activity has ended");
	}
	
}

public class Exception6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Banking b = new Banking();
//		Printing p = new Printing();
//		Adding a = new Adding();
		
		// Option 1
//		b.start();
//		p.start();
//		a.start();
		
		// Option 2
//		Thread t1 = new Thread(b);
//		Thread t2 = new Thread(p);
//		Thread t3 = new Thread(a);
//		
//		t1.start();
//		t2.start();
//		t3.start();
		
		// Option 3
		Activities a = new Activities();
		Activities b = new Activities();
		Activities c = new Activities();
		
		a.setName("BANK");
		b.setName("PRINT");
		c.setName("ADD");
		
		a.start();
		b.start();
		c.start();
		
	}

}
