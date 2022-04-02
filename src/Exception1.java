import java.util.InputMismatchException;
import java.util.Scanner;




public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("connection established");
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a = sc.nextInt();
			System.out.println("Enter the denominator");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println(c);
			
			System.out.println("Enter the size of the array");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter the index at which the element has to be inserted");
			int index = sc.nextInt();
			System.out.println("Enter the element to be inserted");
			int elem = sc.nextInt();
			arr[index]=elem;
			System.out.println(arr[index]);
		} catch (ArithmeticException e) {
			System.out.println("Enter a non-zero denominator");
		}catch (NegativeArraySizeException e) {
			System.out.println("Enter a non-negative size");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter an index within bounds");
		}catch (InputMismatchException e) {
			System.out.println("Enter a integer");
		}catch (Exception e) {
			System.out.println("Invalid input");
		}
		
		System.out.println("connection terminated");

	}

}
