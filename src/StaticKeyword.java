import java.util.Scanner;


//class Addition{
//	public static int add(int arr[]) {
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		return sum;
//	}
//}

public class StaticKeyword{
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int ans = Addition.add(arr);
		System.out.println(ans);
	}
}



























//class Demo {
//	int a;
//	static int m;
//	
//	{
//		a=10;
//	}
//	
//	static {
//		m = 100;
//	}
//	
//	void disp1() {
//		System.out.println(a);
//		System.out.println(m);
//	}
//	
//	static void disp2() {
//		System.out.println(a); // static method cannot access instance variable
//		System.out.println(m);
//	}
//	
//}
//
//
//
//public class StaticKeyword {
//	public static void main(String[] args) {
//		Demo.disp2(); // error
//		Demo d = new Demo();
//		d.disp1();
//
//	}
//}





//class Dog {
//	String name;
//	String color;
//	int cost;
//	static int total;
//	Dog() {
//		total++;
//	}
//	Dog(String name, String color, int cost) {
//		total++;
//		this.name = name;
//		this.color = color;
//		this.cost = cost;
//	}
//}
//
//public class StaticKeyword {
//	public static void main(String[] args) {
//		Dog d1 = new Dog();
//		System.out.println(Dog.total);
//		Dog d2 = new Dog();
//		System.out.println(Dog.total);
//		Dog d3 = new Dog("Betty", "White", 2000);
//		System.out.println(Dog.total);
//	}
//}







//class Farmer {
//	private float p;
//	private float t;
//	private static float r; // static variable
//	private float si;
//	
//	static {
//		r = 2.5f;
//	}
//	
//	void input() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the principle: ");
//		p = sc.nextFloat();
//		System.out.println("Enter the duration (in years): ");
//		t = sc.nextFloat();
//	}
//	
//	void compute() {
//		si = p*t*r;
//	}
//	
//	float disp() {
//		return si;
//	}
//	
//	
//}
//
//public class StaticKeyword {
//	public static void main(String[] args) {
//		Farmer f1 = new Farmer();
//		Farmer f2 = new Farmer();
//		Farmer f3 = new Farmer();
//		
//		f1.input();
//		f1.compute();
//		f1.disp();
//		
//		f2.input();
//		f2.compute();
//		f2.disp();
//		
//		f3.input();
//		f3.compute();
//		f3.disp();
//	}
//}


//class Farmer{
//	private float p;
//	private float t;
//	private float r=2.5f;
//	private float si;
//	
//	void input() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the principle: ");
//		p = sc.nextFloat();
//		System.out.println("Enter the duration (in years): ");
//		t = sc.nextFloat();
//	}
//	
//	void compute() {
//		si = p*t*r;
//	}
//	
//	float disp() {
//		return si;
//	}
//	
//	
//}
//
//public class StaticKeyword {
//	public static void main(String[] args) {
//		Farmer f1 = new Farmer();
//		Farmer f2 = new Farmer();
//		Farmer f3 = new Farmer();
//		
//		f1.input();
//		f1.compute();
//		f1.disp();
//		
//		f2.input();
//		f2.compute();
//		f2.disp();
//		
//		f3.input();
//		f3.compute();
//		f3.disp();
//	}
//}
