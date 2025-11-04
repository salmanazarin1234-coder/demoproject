package assignment;

public class Student2 extends Student {
String address;
public void getAddress(String a) {
	address=a;
}
public void display()
{
	System.out.println("enter the student name:"+ name);
	System.out.println("enter the student roolno:"+ rollno);
	System.out.println("enter the student address:"+address);
}
	public static void main(String[] args) {
		Student2 object=new Student2();
		object.getDetails("salma", 1);
		object.getAddress("Mangalapuram");
		object.display();
		
		// TODO Auto-generated method stub

	}

}
