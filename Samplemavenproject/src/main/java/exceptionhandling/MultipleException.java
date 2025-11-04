package exceptionhandling;

import java.io.IOException;

public class MultipleException {

	public static void main(String[] args) throws IOException {
		try
		{
			String a=null;
			System.out.println(a.length());
		/*int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);*/
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NullPointerException n) {
			System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		
		// TODO Auto-generated method stub

	

}
