package exceptionhandling;

public class Exceptioneg {

	public static void main(String[] args) {
		System.out.println("before exception");
		try
		{
		String a=null;
		System.out.println(a.length());
		}
		catch (Exception e) {
			System.out.println(e);
		

		}
		finally {
			
		
		System.out.println("after exception");
		}
		
		// TODO Auto-generated method stub

	}

}
