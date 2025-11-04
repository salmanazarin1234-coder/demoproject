package inheritanceAssignment;

public class Totalsalary extends Salary{
	double total;
	public void salaryslip()
	{
		total=basicpay+hra+pf-deduction+bonus;
		System.out.println("salaryslip:"+total);
	}

	public static void main(String[] args) {
		Totalsalary obj=new Totalsalary();
		obj.details(2000, 3000, 1000);
		obj.display();
		obj.salaryslip();
		
		// TODO Auto-generated method stub

	}

}
