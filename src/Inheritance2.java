class Demo1 {
	int a = 10;
}

class Demo2 extends Demo1 {
	int a = 100;
	void display() {
		int a = 1000;
		System.out.println(a); // 1000 (local variable)
		System.out.println(this.a); // 100 (instance variable)
		System.out.println(super.a); // 10 (parent variable)
	}
}

class Plane {
	void takeOff() {
		System.out.println("Taking off");
	}
	
	void fly() {
		System.out.println("Flying off");
	}
	void land() {
		System.out.println("Landing..");
	}
}

//abstract class Plane {
//	abstract void takeOff();
//	abstract void fly();
//	abstract void land();
//}

class PassengerPlane extends Plane {
	void fly() {
		System.out.println("Passenger plane flying off"); // overwritten method
	}
	void carryPassenger() {
		System.out.println("Carrying passenger.."); // specialized method
	}
}

class CargoPlane extends Plane {
	void fly() {
		System.out.println("Cargo plane flying off"); // overwritten method
	}
	void carryCargo() {
		System.out.println("Carrying cargo.."); // specialized method
	}
}

class FighterPlane extends Plane {
	void fly() {
		System.out.println("Fighter plane flying off"); // overwritten method
	}
	void fightingPlanes() {
		System.out.println("Fighting planes.."); // specialized method
	}
}

class Airport {
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}




public class Inheritance2 {
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.display();
		
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		CargoPlane cp = new CargoPlane();
		
//		pp.takeOff();
//		pp.fly();
//		pp.carryPassenger();
//		pp.land();
//		
//		cp.takeOff();
//		cp.fly();
//		cp.carryCargo();
//		cp.land();
//		
//		fp.takeOff();
//		fp.fly();
//		fp.fightingPlanes();
//		fp.land();
		
		
		// polymorphism
		// no advantage for the code below, just to emphasize definition of polymorphism
		// Polymorphism = parent reference to child object
		Plane ref;
		ref = pp;
		ref.fly();
		ref = cp;
		ref.fly();
		ref = fp;
		ref.fly();
		
		
		// advantage of polymorphism
		Airport ap = new Airport();
		// Plane ref = PassengerPlane pp => polymorphism. left handside type != right handside type
		ap.permit(pp);
		ap.permit(cp);
		ap.permit(fp);
		
	}
}

























