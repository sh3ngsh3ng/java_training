class Addition {
	public static int add(int arr[]) {
		int sum = 0;
		for (int i = 0; i< arr.length; i++) {
			sum +=arr[i];
		}
		return sum;
	}
}


public class LaunchAddition {
	public static void main(String[] args) {
//		Addition a = new Addition();
		// Anonymous objects are objects without any reference. If use only once
		int result = Addition.add(new int[] {1, 2, 3, 4, 5});
		System.out.println(result);
	}
}
