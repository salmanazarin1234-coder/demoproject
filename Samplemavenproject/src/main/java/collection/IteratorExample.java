package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String>array=new ArrayList<String>();
		array.add("black");
		array.add("white");
		array.add("blue");
		array.add("violet");
		Iterator it=array.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		it.remove();
		System.out.println(array);
		// TODO Auto-generated method stub

	}

}
