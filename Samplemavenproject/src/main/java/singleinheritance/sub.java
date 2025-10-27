package singleinheritance;

public class sub extends Inheritanceexample
{
	int a=20;
	public sub()
	{
		super("hello");
		System.out.println("child class constructor");
	}
	public void sub() {
	//super.sum();
		int d=b-a;
		System.out.println(d);
		System.out.println("the value of a:"+super.a);
		
	}

	public static void main(String[] args) {
		sub obj=new sub();
				//obj.sum();
				//obj.sub();
				
		// TODO Auto-generated method stub

	}

}
