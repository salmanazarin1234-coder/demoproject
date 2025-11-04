package superkeywordAssignment;

public class Addition2 extends Addition1 {
	public void display(int a,int b) {
		int sum=super.sum(a, b);
		if(sum%10==0) {
			System.out.println("is divisible by 10");
		}
		else {
			System.out.println("not divisible by 10");
		}
	}

	public static void main(String[] args) {
		Addition2 obj=new Addition2();
		obj.display(20, 25);
		// TODO Auto-generated method stub

	}

}
