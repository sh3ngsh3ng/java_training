
// explicit type casting reduces the precision
public class TypeCasting {
	public static void main(String[] args) {
		int a = 130;
		byte b;
		b = (byte)a;
		System.out.println(a); // 130
		System.out.println(b); // -126
	}
}


