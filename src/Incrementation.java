
//public class Incrementation {
//	public static void main(String[] args) {
//		int a = 10;
//		int b;
//		a++;
//		b = a;
//		System.out.println(a);
//		System.out.println(b);
//	}
//}
//a = 11
//b = 11

//public class Incrementation {
//	public static void main(String[] args) {
//		int a = 10;
//		int b;
//		++a;
//		b = a;
//		System.out.println(a);
//		System.out.println(b);
//	}
//}
//a = 11
//b = 11

//public class Incrementation {
//	public static void main(String[] args) {
//		int a = 10;
//		int b;
//		b = a++;
//		System.out.println(a);
//		System.out.println(b);
//	}
//}
//a = 11
//b = 10

//public class Incrementation {
//	public static void main(String[] args) {
//		int a = 10;
//		int b;
//		b = ++a;
//		System.out.println(a);
//		System.out.println(b);
//	}
//}
//a = 11
//b = 11


//public class Incrementation {
//	public static void main(String[] args) {
//		int a = 7;
//		System.out.println(a++ + a--); // 15
//		System.out.println(a); // 7
//	}
//}

//public class Incrementation {
//	public static void main(String[] args) {
//		int a = 7;
//		System.out.println(--a + --a + a++); // 16
//		System.out.println(a); // 6
//	}
//}

//public class Incrementation {
//	public static void main(String[] args) {
//		int a = 7;
//		System.out.println(++a + --a - ++a + --a - ++a + ++a - ++a + a++); // 15
//		System.out.println(a); // 11
//	}
//}


public class Incrementation {
	public static void main(String[] args) {
		int a = 7;
		System.out.println((--a + --a) + (a-- + --a) * (++a + a++) - (--a + --a)); // 68
		System.out.println(a); // 3
	}
}


//public class Incrementation {
//	public static void main(String[] args) {
//		int a = 7;
//		int b = ++10; // error. cannot apply unary operator to number
//		System.out.println(a);
//		System.out.println(b);
//	}
//}

//public class Incrementation {
//	public static void main(String[] args) {
//		int a = 10;
//		int b = ++(++a); // error. cannot (++a) gives a number
//		System.out.println(a);
//		System.out.println(b);
//	}
//}



