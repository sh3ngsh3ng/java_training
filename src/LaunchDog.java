//class Dog {
//	String name;
//	String color;
//	int cost;
//	
//	// name of method same as class name
//	// method with no return type => constructor
//	Dog(String name, String color) {
//		this.name = name;
//		this.color = color;
//	}
//	
//	Dog(String name, String color, int cost) {
//		this("Spinny", "White"); // call another constructor of same class => local chaining
//	}
//	
//	public void disp() {
//		System.out.println(name);
//		System.out.println(color);
//		System.out.println(cost);
//	}
//	
//}
//
//
//public class LaunchDog {
//	public static void main(String[] args) {
//		Dog d = new Dog("Rocky", "Brown", 10000);
//		d.disp();
//	}
//}



//class Dog {
//	String name;
//	String color;
//	int cost;
//	
//	Dog() {
//		name="Ruby";
//		color = "Black";
//		cost = 15000;
//	}
//	
//	Dog(String name) {
//		this();
//		this.name=name;
//		cost=20000;
//	}
//	
//	Dog(String name, String color, int cost) {
//		this("Spinny");
//		// this();
//	}
//	
//	public void disp() {
//		System.out.println(name);
//		System.out.println(color);
//		System.out.println(cost);
//	}
//}
//
//
//public class LaunchDog {
//	public static void main(String[] args) {
//		Dog d = new Dog("Rocky", "Brown", 10000);
//		d.disp();
//	}
//}