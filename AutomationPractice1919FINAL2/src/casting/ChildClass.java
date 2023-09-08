package casting;

public class ChildClass extends ParentClass
{
	String name = "Chintu";
	
	public void getData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	//main
	public static void main(String[] args) 
	{
		ChildClass x = new ChildClass();
		x.getData();
		
	}


}
