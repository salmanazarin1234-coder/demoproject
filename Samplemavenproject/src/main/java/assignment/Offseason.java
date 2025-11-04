package assignment;

public class Offseason extends Onseason {
	public void discount(double price) {
		price=price*0.15;
		System.out.println("enter the offseason:"+ price);
	}

	public static void main(String[] args) {
		Offseason obj=new Offseason();
		Onseason obj1=new Onseason();
		obj.discount(1000);
		obj1.discount(1000);
		// TODO Auto-generated method stub

	}

}
