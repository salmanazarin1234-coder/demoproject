package interfacepackage;

public class Interfacechild implements Interfaceparent {

	public static void main(String[] args) {
		Interfaceparent object=new Interfacechild();
		object.display();
		//object.show();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("interface example");
		// TODO Auto-generated method stub
		
	}
	public void show() {
		System.out.println("interface package");
	}

}
