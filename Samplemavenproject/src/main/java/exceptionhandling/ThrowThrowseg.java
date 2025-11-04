package exceptionhandling;

public class ThrowThrowseg {

	public static void main(String[] args) throws votingException   {
		int age=15;
		if(age>=18) {
			System.out.println("eligilble for voting");
		}
		else
		{
			throw new votingException("age under 18");
		}
		// TODO Auto-generated method stub

	}

}
