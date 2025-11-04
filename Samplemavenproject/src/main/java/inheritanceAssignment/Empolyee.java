package inheritanceAssignment;

public class Empolyee {
	double basicpay;
	double deduction;
	int bonus;
	public void details(double basicpay,double deduction, int bonus)
	{
		this.basicpay=basicpay;
		this.deduction=deduction;
		this.bonus=bonus;
		System.out.println("basic pay:"+ basicpay);
		System.out.println("deduction:"+deduction);
		System.out.println("bonus:"+bonus);
	}

}
