package accessModified;

public class Accessmodifiedeg {
	public int a=5;
	private int b=10;
	int c=5;
	protected int d=20;
	public void publicmethod()
	{
		System.out.println("This is public method");
	}
    private void privatemethod() 
    {
    	System.out.println("This is private method");
    }
    void defaultmethod()
    {
    	System.out.println("This is defualt method");
    }
    protected void protectedmethod() {
    	System.out.println("This is protected method");
    }
	public static void main(String[] args) {
		Accessmodifiedeg object=new Accessmodifiedeg();
		/*object.publicmethod();
		object.privatemethod();
		object.defaultmethod();
		object.protectedmethod();
		
		
		
		
	*/	// TODO Auto-generated method stub

	}

}
