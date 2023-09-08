package casting;

public class Child1 extends Parent1
{
	public Child1()
	{
		super();  //invoke-parent class const
		System.out.println("CHild class constructor");
	}
	
	public static void main(String[] args)
	{
		Child1 x = new Child1();
		
		//invoke process-parent const call
		//const -inheritance-not possible
	}

	
}