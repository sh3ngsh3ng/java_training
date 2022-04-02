import java.util.Arrays;
import java.util.Scanner;




// ONE DIMENSIONAL ARRAY

//public class _4_Arrays {
//	public static void main(String[] args) {
//		int marks[] = {10, 20, 30, 40};
//		
//		// Printing address of array
//		System.out.println(marks); // => I@3fee733d
//		
//		// Printing array's value
//		System.out.println(Arrays.toString(marks)); // => [10, 20, 30, 40]
//		
//	}
//}




// TWO DIMENSIONAL ARRAY

//public class _4_Arrays {
//	public static void main(String[] args) {
//		int marks[][] = {{1,2,3,4}, {10,20,30,40}, {100,200,300,400}};
//		
//		System.out.println(marks); // => address
//		System.out.println(Arrays.toString(marks)); // => [[address], [address], [address]]
//		System.out.println(Arrays.deepToString(marks)); // => values of 2d array
//	}
//}


//public class _4_Arrays {
//	public static void main(String[] args) {
//		int marks[] = new int[5];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Enter a number: ");
//			marks[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < marks.length; i++) {
//			System.out.println(marks[i]);
//		}
//	}
//}


//public class _4_Arrays {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int classList[][] = new int[2][5];
//		for (int i = 0; i < classList.length; i++) {
//			for (int j = 0; j < classList[i].length; j++) {
//				System.out.println("Enter a number: ");
//				classList[i][j] = sc.nextInt();
//			}
//		}
//		
//		System.out.print(Arrays.deepToString(classList));
//		
//	}
//}


//public class _4_Arrays {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int marks[][][] = new int[2][2][3];
//		
//		for (int i = 0; i < marks.length; i ++) {
//			for (int j = 0; j < marks[i].length; j++) {
//				for (int k = 0; k < marks[i][j].length; k++) {
//					System.out.println("Enter marks");
//					marks[i][j][k] = sc.nextInt();
//				}
//			}
//		}
//		
//		System.out.println(Arrays.deepToString(marks));
//	}
//}


//public class _4_Arrays {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int marks[][] = new int[2][];
//		
//		System.out.println("enter class size of class A");
//		
//		int classSizeA = sc.nextInt();
//		
//		System.out.println("enter class size of class B");
//		
//		int classSizeB = sc.nextInt();
//		
//		marks[0] = new int[classSizeA];
//		marks[1] = new int[classSizeB];
//		
//		for (int i = 0; i < marks.length; i ++) {
//			for (int j = 0; j < marks[i].length; j++) {
//				System.out.println("Enter marks class " + i + " student " + j);
//				marks[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println(Arrays.deepToString(marks));
//	}
//}




// Finding unique numbers

//public class Array {
//	
//	static void findUnique(int arr[], int n) {
//		for (int i = 0; i < n; i++) {
//			int j;
//			for (j = 0; j < i; j++) {
//				if (arr[i] == arr[j])
//					break;
//			}
//			if( i == j)
//				System.out.print(arr[i] + " ");
//		}
//	}
//	
//	public static void main(String[] args) {
//		int arr[] = {1, 2, 1};
//		int n = arr.length;
//		findUnique(arr, n);
//	}
//}





