package multilevelinheritance;

public class Multiple  extends Sub{
	public void multiplication()
	{
		int m=a*b*d;
		System.out.println(m);
		
	}

	public static void main(String[] args) {
		Multiple obj=new Multiple();
		obj.sum();
		obj.sub();
		obj.multiplication();
		// TODO Auto-generated method stub

	}

}
