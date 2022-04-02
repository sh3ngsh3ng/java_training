// 4 Types of loops
// 1) for
// 2) while
// 3) do-while
// 4) for-each (enhanced for-loop)

// There must be 3 steps
// 1) Initialize
// 2) condition
// 3) Inc/dec



//public class Loops {
//	public static void main(String[] args) {
//		for (int i = 1; i <=5; i++) {
//			System.out.print("*");
//		}
//	}
//}


//public class Loops {
//	public static void main(String[] args) {
//		int arr[] = {1, 2, 3, 4, 5};
//		for (int i = 1; i <= arr.length; i++) {
//			System.out.print(arr[i]);
//		}
//	}
//}

//public class Loops {
//	public static void main(String[] args) {
//		int arr[] = {1, 2, 3, 4, 5};
//		for (int a:arr) {
//			System.out.print(a);
//		}
//	}
//}


public class Loops {
	public static void main(String[] args) {
		int sum = 0;
		int arr[] = {1, 2, 3, 4, 5};
		for (int a:arr) {
			sum += a;
		}
		System.out.println(sum);
	}
}