import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Actor implements Serializable {
	int age;
	String name;
	
	Actor(int age, String name) {
		this.age = age;
		this.name = name;
	}
}


public class Serialization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Actor a = new Actor(31, "Tom");
		FileOutputStream fos = new FileOutputStream("C://test//input.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(a);
		
	}

}
