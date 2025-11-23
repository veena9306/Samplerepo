package SuperKeyword;

public class SuperMethodChild extends SuperMethodParent
{
	public void print()
	{
		System.out.println("from child");
		super.display();
		}

	public static void main(String[] args) {
		SuperMethodChild obj=new SuperMethodChild();
		obj.print();
		// TODO Auto-generated method stub

	}

}