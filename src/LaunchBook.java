
class Book {
	private int pagenumber;
	
	public void setData(int x) {
		if (x < 0) {
			
		}
		pagenumber = x;
	}
	
	public int getData() {
		return pagenumber;
	}
}


public class LaunchBook {
	public static void main(String[] args) {
		Book b = new Book();
		b.setData(100);
		System.out.println(b.getData());
	}
}
