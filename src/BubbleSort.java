import java.util.Arrays;

class Sort {
	public static int countBits(int n) {
		int sum = 0;
		while(n!=0) {
			if (n%2 == 1) {
				sum++;
			}
			n = n/2;
		}
		
		return sum;
	}
	
	static int[] sortByBits(int arr[]) {
		for(int i = 0;i<arr.length; i++) {
			for (int j = 0; j <arr.length - 1; j++) {
				if (countBits(arr[j]) > countBits(arr[j+1]) ) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 2, 3, 7, 8, 10, 11};
		int[] result = Sort.sortByBits(arr);
		System.out.println(Arrays.toString(result));
		
	}

}
