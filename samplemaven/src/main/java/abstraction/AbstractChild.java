package abstraction;

public class AbstractChild extends AbstractParent
{
	public static void main(String args[])
	{
		AbstractChild obj=new AbstractChild();
		obj.display();
		obj.print();
		
	}
	public void display()
	{
		System.out.println("display method of abstract");
	}
     public void print()
     {
    	 System.out.println("print method of abstract");
     }
}
