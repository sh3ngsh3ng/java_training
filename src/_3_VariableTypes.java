class Person {
	int age;
	String name;
	float height;
	boolean is_married;
}



public class _3_VariableTypes {
	
	// Instance variables: inside a class;
	int a=10;
	float b;
	String c;
	
	static void display() {
		// Local Variables: inside a method;
		// when declaring a local variable, must give a value and use it
		int a;
		float b;
		String c;
	}
	
	
	
	
	public static void main(String[] args) {
		display(); // => nothing
		Person p = new Person();
		System.out.println(p.age); // => 0
		System.out.println(p.name); // => null
		System.out.println(p.height); // => 0.0
		System.out.println(p.is_married); // => false
	}
}
