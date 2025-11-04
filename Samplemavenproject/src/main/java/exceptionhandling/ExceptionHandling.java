package exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		int c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("exception");
		}
		// TODO Auto-generated method stub

	}

}
