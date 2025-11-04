package collection;

import java.util.ArrayList;

public class CollectionForeachExample {

	public static void main(String[] args) {
		ArrayList<String>array=new ArrayList<String>();
		array.add("black");
		array.add("white");
		array.add("blue");
		array.add("violet");
		for(String c : array)
		{
			System.out.println(c);
		}
		// TODO Auto-generated method stub

	}

}
