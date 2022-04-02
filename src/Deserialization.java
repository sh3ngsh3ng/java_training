import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
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


public class Deserialization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C://test//input.txt");
		ObjectInputStream oos = new ObjectInputStream(fis);
		
		
		Actor a = (Actor)oos.readObject();
		System.out.println(a  );
	}

}
