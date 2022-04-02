
//public class CompareString{
//	public static void main(String[] args) {
//		StringBuilder s1 = new StringBuilder("Teest");
//		s1.reverse();
//		System.out.println(s1);
//	}
//}

public class CompareString{
	public static void main(String[] args) {
		String s = "sachin";
		String n = "";
		
		for (int i=s.length() - 1; i >= 0; i--) {
			n += s.charAt(i);
//			n = s.charAt(i) + n;
		}
		System.out.println(n);
	}
}


// Strings created by string class are immutable
// use StringBuffer / StringBuilder to make mutable strings
//public class CompareString{
//	public static void main(String[] args) {
//		StringBuffer s1 = new StringBuffer();
//		System.out.println(s1.capacity());
//		s1.append("Sachin");
//		System.out.println(s1);
//		s1.append(" is a great man"); // extra capacity given => (old * 2) + 2
//		System.out.println(s1.capacity());
//		System.out.println(s1);
//		
//	}
//}

//public class CompareString{
//public static void main(String[] args) {
//	String s1 = "RAMA";
//	String s2 = "RAJU"; // immutable
//	String s3 = new String("Test"); // immutable
//	s1.concat("SACHIN");
//	String s4 = s1.concat("SACHIN");
//	StringBuffer s5 = new StringBuffer("Mutable");
//	System.out.println(s1);
//	System.out.println(s2);
//	System.out.println(s3);
//	System.out.println(s4);
//}
//}

//
//public class CompareString {
//	public static void main(String[] args) {
//		String s1 = "RAMU"; // string created in constant pool
//		String s2 = "RAMU";
//		System.out.println(s1.equals(s2));
//		System.out.println(s1==s2);
//		
//		String s3 = new String("Ramu"); // created outside constant pool
//		String s4 = new String("Ramu");
//		System.out.println(s3.equals(s4));
//		System.out.println(s3==s4);
//	}
//}
