
class Weapon implements Runnable {
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " has acquired the knife");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " has acquired the gun");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " has acquired the bomb");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



class Warrior extends Thread {
	String resource1="knife";
	String resource2="gun";
	String resource3="bomb";
	public void run() {
		if (getName().equals("Warrior 1")) {
			wOneAcquiredResource();
		} else {
			wTwoAcquiredResource();
		}
	}
	
	void wOneAcquiredResource() {
		try {
			synchronized(resource1) {
				System.out.println("Warrior 1 has acquired "+ resource1);
				Thread.sleep(5000);
				synchronized(resource2) {
					System.out.println("Warrior 1 has acquired "+ resource2);
					Thread.sleep(5000);
					synchronized(resource3) {
						System.out.println("Warrior 1 has acquired "+ resource3);
						Thread.sleep(5000);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void wTwoAcquiredResource() {
		try {
			synchronized(resource1) {
				System.out.println("Warrior 2 has acquired "+ resource1);
				Thread.sleep(5000);
				synchronized(resource2) {
					System.out.println("Warrior 2 has acquired "+ resource2);
					Thread.sleep(5000);
					synchronized(resource3) {
						System.out.println("Warrior 2 has acquired "+ resource3);
						Thread.sleep(5000);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




public class Threading4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Weapon w = new Weapon();
//
//		Thread t1 = new Thread(w);
//		Thread t2 = new Thread(w);
//		
//		t1.setName("Warrior 1");
//		t2.setName("Warrior 2");
//		
//		t1.start();
//		t2.start();
		
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();
		
		w1.setName("Warrior 1");
		w2.setName("Warrior 2");
		
		w1.start();
		w2.start();
		
	}

}
