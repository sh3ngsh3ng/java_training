class Demo {
	int a=10;
	float b=20.5f;
	private int c = 20;
	private float d = 30.5f;
	
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}

class Demo2 extends Demo {
}

// Private will not be inherited
class Demo3 extends Demo {
	void display() {
		System.out.println(c);
		System.out.println(d); 
	}
}


// super method
class Demo4 {
	// hidden constructor
	// super method calls class Object if none specified
	int a=11;
	int b=22;
	
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}

class Demo5 extends Demo4 {
	Demo5() {
		super(); // constructor chaining
	}
}

// start of quiz 1
class Demo6 {
	int a = 10;
	int b = 20;
	Demo6() {
		
	}
	Demo6(int a, int b) {
		this.a = a;
		this.b = b;
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}

class Demo7 extends Demo6 {
	Demo7() {
		a = 100;
		b = 200;
	}
}
// end of quiz 1

// start of quiz 2
class Demo8 {
	int a = 10;
	int b = 20;
	Demo8() {
		
	}
	Demo8(int a, int b) {
		this.a = a;
		this.b = b;
	}
	Demo8(int a) {
		this(1000,2000); // if this method is called, super method is not called. Either/or
		this.a = a;
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}

class Demo9 extends Demo8 {
	Demo9() {
//		super(111,222); output => a = 100, b = 200
		super(199); // output => a = 10 -> 1000 -> 199 -> 100, b = 20 -> 2000 -> 200
		a = 100;
		b = 200;
	}
}
// end of quiz 2


// constructor call must be the first statement in a constructor
// cyclic inheritance not permitted in java



public class InheritanceConcept {
	
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.display();

		Demo5 d5 = new Demo5();
		d5.display();
		
		Demo7 d7 = new Demo7();
		d7.display();
		
		Demo9 d9 = new Demo9();
		d9.display();
	}

}
