class Animal {
	void eat() {
		System.out.println("Eating food");
	}
	
	void sleep() {
		System.out.println("Sleeping...");
	}
}

class Tiger extends Animal {
	void eat() {
		System.out.println("Eating meat...");
	}
	void sound() {
		System.out.println("Rawr...");
	}
}

class Deer extends Animal {
	void eat() {
		System.out.println("Eating grass...");
	}
	void sound() {
		System.out.println("Mehhhh....");
	}
}

class Monkey extends Animal {
	void eat() {
		System.out.println("Eating banana...");
	}
	void sound() {
		System.out.println("Ooo ooo ahh ahhh");
	}
}

class Zoo {
	void characteristics(Animal a) {
		a.eat();
		a.sleep();
	}
}


public class Inheritance3 {
	public static void main(String[] args) {
		Zoo z = new Zoo();
		Tiger t = new Tiger();
		Deer d = new Deer();
		Monkey m = new Monkey();
		
		z.characteristics(t);
		z.characteristics(d);
		z.characteristics(m);
	}
}





