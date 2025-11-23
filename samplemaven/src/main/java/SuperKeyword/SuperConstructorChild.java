package SuperKeyword;

public class SuperConstructorChild extends SuperConstructorParent
{
	public SuperConstructorChild()
	{
		super(2,4);
		System.out.println("SuperConstructorChild");
	}

	public static void main(String[] args) 
	{
		SuperConstructorChild obj=new SuperConstructorChild();
		// TODO Auto-generated method stub

	}

}
