package collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String>set=new HashSet<String>();
		set.add("hy");
		set.add("hello");
		set.add("world");
		set.add("good");
		Set<String>set1=new HashSet<String>();
		set1.add("morning");
		set1.add("evng");
		set1.add("aftrn");
		set1.add("nyt");
		set.addAll(set1);
		System.out.println(set);
		System.out.println(set.containsAll(set1));
	}

}
