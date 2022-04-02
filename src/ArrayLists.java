import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5f);
		al.add("ABC");
		al.add('R');
		System.out.println(al);
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator ll = al.listIterator(al.size());
		while(ll.hasPrevious()) {
			System.out.println(ll.previous());
		}
		
		ll.next();
		ll.add(1000);
		System.out.println(al);
		
		
		for(Object x:al) {
			System.out.println(x);
		}
		
		
		
	}

}
