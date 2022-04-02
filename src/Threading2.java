

class MSword extends Thread{
	public void run() {
		if (getName().equals("TYPE")) {
			type();
		} else if (getName().equals("SAVE")) {
			save();
		} else {
			check();
		}
	}
	
	void type() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Typing...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	void save() {
		for (;;) {
			System.out.println("Saving...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	void check() {
		for (;;) {
			System.out.println("Checking...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}



public class Threading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MSword ms1 = new MSword();
		MSword ms2 = new MSword();
		MSword ms3 = new MSword();

		ms1.setName("TYPE");
		ms2.setName("SAVE");
		ms3.setName("CHECK");
		
		ms2.setDaemon(true);
		ms3.setDaemon(true);
		
		ms2.setPriority(8);
		ms3.setPriority(9);
		
		ms1.start();
		ms2.start();
		ms3.start();
		
	}

}








