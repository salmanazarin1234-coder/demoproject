package hierarchialinheritance;

public class Subtraction extends Sum{
	public void sub()
	{
		int d=a-b;
		System.out.println(d);
	}

	public static void main(String[] args) {
		Subtraction object=new Subtraction();
		object.sub();
		object.total();
		
		// TODO Auto-generated method stub

	}

}
