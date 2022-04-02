abstract class Bird {
	abstract void fly();
	abstract void eat();
}

abstract class Eagle extends Bird {
	
	void eat() {
		System.out.println("Eagle is eating");
	}
}


class Sparrow extends Bird {
	void fly() {
		System.out.println("Sparrow is flying...");
	}
	
	void eat() {
		System.out.println("Sparrow is eating...")
	}
}


class GoldenEagle extends Eagle {
	void fly() {
		System.out.println("Golden Eagle is flying...");
	}
}

class SerpentEagle extends Eagle {
	void fly() {
		System.out.println("Serpent Eagle is flying...");
	}
}

class Sky {
	void permit(Bird ref) {
		ref.eat();
		ref.fly();
	}
}

public class LaunchBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
