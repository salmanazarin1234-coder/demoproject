package polymorphism;

public class Runtime2 extends Runtimepolymorphismeg{
	public void display()
	{
		super.display();
		System.out.println("child class");
	}

	public static void main(String[] args) {
		Runtime2 object=new Runtime2();
		object.display();
		// TODO Auto-generated method stub

	}

}
