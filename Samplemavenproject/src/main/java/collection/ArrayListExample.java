package collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String>array=new ArrayList<String>();
		array.add("black");
		array.add("white");
		array.add("blue");
		array.add("violet");
		ArrayList<String>arr=new ArrayList<String>();
		arr.add("black color");
		arr.add("white color");
		arr.add("blue color");
		arr.add("violet color");
		array.addAll(arr);
		System.out.println(array);
		System.out.println(array.containsAll(arr));
	}
	

}
