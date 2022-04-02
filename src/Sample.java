import java.util.Arrays;
import java.util.Scanner;
//public class Sample {
//	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("******");
//		}
//	}
//}

//public class Sample {
//	public static void main(String[] args) {
//		for (int i = 0; i < 5; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}

//public class Sample {
//	
//	int totalProduct = 1;
//
//	void calculateTotalProduct(int nums[]) {
//		for (int i = 0; i < nums.length; i++) {
//			totalProduct = totalProduct * nums[i];
//		}
//	}
//	
//	void printNewArray(int nums[]) {
//		int results[] = new int[4];
//		for (int i = 0; i< nums.length; i++) {
//			results[i] = totalProduct / nums[i];
//		}
//		System.out.println(Arrays.toString(results));
//	}
//	
//	public static void main(String[] args) {
//		int nums[] = {4, 2, 1, 7};
//		Sample test = new Sample();
//		test.calculateTotalProduct(nums);
//		test.printNewArray(nums);
//	}
//	
//}


//public class Sample{
//	
//	
//	public static void main(String[] args) {
//		int nums[] = {1, 0, 2, 0, 3, 4, 0, 5};
//		int count = 0;
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] != 0) {
//				nums[count++] = nums[i];
//			}
//		}
//		while (count < nums.length) {
//			nums[count++] = 0;
//		}
//		
//		System.out.print(Arrays.toString(nums));
//	}
//}

//public class Sample {
//	public static void main(String[] args) {
//		int arr[] = {1, 2, 3, 4, 5};
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);
//		
//		int arr2[] = new int[5];
//		for (int i = 0; i < 5; i++) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter a number: ");
//			arr2[i] = sc.nextInt();
//		}
//		System.out.println(Arrays.toString(arr2));
//		
//		
//	}
//}

//public class Sample {
//	public static void main(String[] args) {
//		try {
//			int a, b;
//			b = 0;
//			a=5/b;
//			System.out.print("A");
//		} catch (ArithmeticException e) {
//			System.out.print("B");
//		} finally {
//			System.out.print("c");
//		}
//	}
//}


//public class Sample {
//	public static void main(String[] args) {
//		try {
//			return;
//		} finally {
//			System.out.print("c");
//		}
//	}
//}


//public class Sample {
//	public void m1 (int i, float f) {
//		System.out.print("m1");
//	}
//	
//	public void m2 (float i, int f) {
//		System.out.print("m2");
//	}
//	
//	public static void main(String[] args) {
//		Sample s = new Sample();
//		s.m1(20, 20);
//	}
//}

//abstract class Sample {
//	abstract num(int a, int b) {}
//}

//public class Sample {
//	public static void main(String[] args) {
//		try {
//			throw 10;
//		} catch (int e) {
//			System.out.println("Exception" + e);
//		}
//	}
//}

//public class Sample {
//	public static void main(String[] args) {
//		try {
//			int i, sum;
//			sum = 10;
//			for (i = -1; i < 3; ++i) {
//				sum = (sum/i);
//			}
//		} catch (ArithmeticException e) {
//			System.out.print("0");
//		}
//		System.out.print(sum);
//	}
//}


//public class Sample {
//	public static void main(String[] args) {
//		int count = 1;
//		while (count <= 15) {
//			System.out.println(count%2==1? "***": "+++++");
//			++count;
//		}
//	}
//}

//class Test11 extends Exception {}
//
//public class Sample {
//	public static void main(String args[]) {
//		try {
//			throw new Test();
//		} catch (Test11 t) {
//			System.out.println("Test exception");
//		} finally {
//			System.out.println("Finally");
//		}
//	}
//}

//class Base extends Exception {}
//class Derived extends Base {}
//
//public class Sample {
//	public static void main(String[] args) {
//		try {
//			throw new Derived();
//		} catch (Base b) {
//			System.out.print("Caught base class exception");
//		} catch(Derived d) {
//			System.out.print("Caught derived class exception");
//		}
//	}
//}




//public class Sample extends Thread {
//	public static void main(String[] args) {
//		Sample s = new Sample();
//		s.start();
//		System.out.print("one. ");
//		s.start();
//		System.out.print("two. ");
//	}
//	
//	public void run() {
//		System.out.print("Thread ");
//	}
//}

//public class Sample {
//	public static void main(String[] args) {
//		int arr[2];
//		System.out.println(arr[0]);
//	}
//}

//public class Sample {
//	public void m1(int i, float f) {
//		System.out.println("int method");
//	}
//	public void m1(float i, int f) {
//		System.out.println("float method");
//	}
//	public static void main(String[] args) {
//		Sample s = new Sample();
//		s.m1(20, 20);
//	}
//}

//public class Sample {
//	static int[] nums;
//	
//	
//	public static void main(String[] args) {
//		System.out.println(nums.length);
//	}
//}
public class Example {
	public static void main(String[] args) {
		System.out.println("hi");
	}
}

public class Sample {
	public static void main(String args[]) {
		String[] computer = {"1", "2", "3"};
		String[] parts = {computer[0], computer[2]};
		System.out.println(parts[1]);
	}
}
