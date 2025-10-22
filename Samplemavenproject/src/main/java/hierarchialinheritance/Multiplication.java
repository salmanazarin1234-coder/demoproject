package hierarchialinheritance;

public class Multiplication extends Sum {
	public void multipile()
	{
		int m=b*a;
		System.out.println(m);
	}

	public static void main(String[] args) {
		Multiplication obj=new Multiplication();
		obj.multipile();
		
		// TODO Auto-generated method stub

	}

}
