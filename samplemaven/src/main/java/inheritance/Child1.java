package inheritance;

 public class Child1 extends Parent
{
	public void display1()
	{
		System.out.println("this is the Child1 class");
	}

	
	public static void main(String args[])
	{
		Child1 obj=new Child1();
		obj.display1();
		obj.display();
		
}
}
	
