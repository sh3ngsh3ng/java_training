
class Producer extends Thread {
	Queue a;
	Producer(Queue q) {
		a = q;
	}
	public void run() {
		try {
			int i = 1;
			while (true) {
				a.put(i++);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}

class Consumer extends Thread {
	Queue b;
	
	Consumer(Queue q) {
		b = q;
	}
	
	public void run() {
		try {
			while (true) {
				b.get();
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}


class Queue {
	int x;
	boolean value_present_in_x = false;
	
	synchronized void put(int i) {
		try {
			if (value_present_in_x == false) {
				x = i;
				System.out.println("I have put " + i + " into x");
				value_present_in_x = true;
				notify();
			} 
			else {
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	synchronized void get() {
		try {
			if (value_present_in_x) {
				System.out.println("I have taken " + x + " from x");
				value_present_in_x = false;
				notify();
			} 
			else {
				wait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}


public class Threading5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();
	}

}
