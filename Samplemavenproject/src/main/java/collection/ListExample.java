package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("red");
		list.add("blue");
		list.add("black");
		list.add("white");
		System.out.println(list);	
		System.out.println(list.contains("blue"));
		System.out.println(list.indexOf("blue"));
		System.out.println(list.lastIndexOf("red"));
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.remove(2));
		System.out.println(list);
		// TODO Auto-generated method stub

	}

}
