package constuctor;

public class DefConstEx1 
{
	int rlno,age; //declaration here..............
	String name;
	
	public DefConstEx1(     )
   //some line from  branch
	{
		rlno=1;
		age=24;
		name="pradip";
		
	}
	public void display()
	{
		System.out.println("roll number"+rlno);
		System.out.println("age is"+age);
		System.out.println("name is"+name);
	}
	
	public static void main(String[] args)  //this is a main method 
	{
		DefConstEx1  dd=new DefConstEx1();
		dd.display(); //we calling a method

	}

}
