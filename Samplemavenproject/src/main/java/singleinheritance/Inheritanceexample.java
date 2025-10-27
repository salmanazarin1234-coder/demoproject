package singleinheritance;

public class Inheritanceexample {
	int a=5;
	int b=2;
	public Inheritanceexample()
	{
		System.out.println("Parent class constructor");
	}
	public Inheritanceexample(String S)
	{
		this();
		System.out.println("This is paramaterized constructor:"+S);
	}
	public void sum()
	{
		int c=a+b;
		System.out.println(c);
	}
	}


