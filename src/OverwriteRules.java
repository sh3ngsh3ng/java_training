class Animal1 {
}

class Tiger1 extends Animal1 {
}

class Exmp1{
	public void display() {
		System.out.println("Inside Exmp1");
	}
	
	Animal1 display1() {
		System.out.println("Inside Exmp1");
		Animal1 a = new Animal1();
		return a;
	}
	
//	Tiger1 display1() {
//		System.out.println("Inside Exmp2");
//		Tiger1 t = new Tiger1();
//		return t;
//	}
}


// 4 types of specifier

class Exmp2 extends Exmp1 {
	
//	void display() {
//		System.out.println("Inside Exmp2"); 
//	}
	
	Tiger1 display1() {
		System.out.println("Inside Exmp2");
		Tiger1 t = new Tiger1();
		return t;
	}
	
//	Animal1 display1() {
//		System.out.println("Inside Exmp1");
//		Animal1 a = new Animal1();
//		return a;
//	}

}


public class OverwriteRules {
	public static void main(String[] args) {
//		Exmp2 e2 = new Exmp2();
//		e2.display();  // => error. cannot reduce the visibility of the inherited method from Exmp1
		
		Exmp2 e2 = new Exmp2();
		e2.display1();
		
	}
}
