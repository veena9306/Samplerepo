package inheritance;

public class Child2 extends Parent
{
	public void display2()
	{
		System.out.println("this is the Child2 class");
	}

	public static void main(String args[])
	{
		
		Child2 obj2=new Child2();
		obj2.display2();
		obj2.display();
	}
	
	
}
