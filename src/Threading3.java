


class Bathroom implements Runnable {
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " has entered the bathroom"); 
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " is using the bathroom"); 
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName() + " has exited the bathroom"); 
		} catch (Exception e) {
			// handling exceptions
			e.printStackTrace();
		}
	}
}





public class Threading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// one resource
		Bathroom b = new Bathroom();
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);
		
		t1.setName("BOY");
		t2.setName("GIRLS");
		t3.setName("OTHERS");
		
		
		// Handing over to thread scheduler
		t1.start();
		t2.start();
		t3.start();
	}

}
