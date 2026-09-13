class Shape
{
	void displayShape()
	{
		System.out.println("This is a Shape.");
	}
}
class Rect extends Shape
{
	void displayReactangle()
	{
		System.out.println("This is a Rectangle Shape.");
	}
}
class Circle extends Shape
{
	void displayCircle()
	{
		System.out.println("This is a Circle Shape.");
	}
}
class Squ extends Rect
{
	void displaySquare()
	{
		System.out.println("Square is a Rectangle.");
	}
}
public class Shapes 
{
	public static void main(String[] args) 
	{
		Squ objSquare=new Squ();
		objSquare.displayShape();
		objSquare.displayReactangle();
	}

}
