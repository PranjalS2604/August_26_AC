class Parent
{
	void display()
	{
		System.out.println("This is parent Class.");
	}
}
class Child extends Parent
{
	void show()
	{
		System.out.println("This is child Class.");
	}
}

public class Program 
{
	public static void main(String[] args) 
	{
		Parent objParent = new Parent();
		objParent.display();
		
		Child objChild=new Child();
		objChild.show();

		objChild.display();
	}

}
