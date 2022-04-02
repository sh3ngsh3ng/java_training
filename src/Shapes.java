import java.util.Scanner;

abstract class Group {
	float area;
	
	abstract void input();
	abstract void compute();
	void disp() {
		System.out.println(area);
	}
	
}


class Rectangle extends Group {
	float length;
	float breadth;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the breadth of rectangle");
		breadth = sc.nextFloat();
		System.out.println("Enter the length of rectangle");
		length = sc.nextFloat();
	}
	
	void compute() {
		super.area = length * breadth;
	} 
	
	void disp() {
		System.out.println(area);
	}
}

class Triangle extends Group {
	float height;
	float base;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of triangle");
		base = sc.nextFloat();
		System.out.println("Enter the height of triangle");
		height = sc.nextFloat();
	}
	
	void compute() {
		super.area = 0.5f*base*height;
	} 
	
	void disp() {
		System.out.println(area);
	}
}

class Circle extends Group { 
	float radius;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		radius = sc.nextFloat();
	}
	
	void compute() {
		super.area = radius * radius;
	} 
	
	void disp() {
		System.out.println(area);
	}
}

class Lines {
	void permit(Group ref) {
		ref.input();
		ref.compute();
		ref.disp();
	}
}



public class Shapes {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
//		t.input();
//		t.compute();
//		t.disp();
//		
//		r.input();
//		r.compute();
//		r.disp();
//		
//		c.input();
//		c.compute();
//		c.disp();
		
		Lines d = new Lines();
		d.permit(t);
		d.permit(r);
		d.permit(c);
	}
}
