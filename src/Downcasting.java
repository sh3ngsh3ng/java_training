class Parent {
	void eat() {
		System.out.println("Parent is eating");
	}
}

class Child1 extends Parent {
	void eat() {
		System.out.println("Child1 eats a lot");
		
	}
	
	void cry() {
		System.out.println("Child1 cries loudly");
	}
}


class Child2 extends Parent {
	void eat() {
		System.out.println("Child2 eats very little");
	}
	void cry() {
		System.out.println("Child2 does not cry");
	}
}



public class Downcasting {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		Parent p = new Parent();
		
		p = c1;
		p.eat();
//		p.cry(); // specialized method => parent cannot accessed
		((Child1)(p)).cry(); // downcasting => asking the parent to behave as child
		
		
		p = c2;
		p.eat();
//		p.cry(); // specialized method => parent cannot accessed
		((Child2)(p)).cry(); // downcasting => asking the parent to behave as child
		
	}
}
