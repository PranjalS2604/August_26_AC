class Rectangle
{
	float Length;
	float Breadth;
	Rectangle(float length,float breadth)
	{
		Length=length;
		Breadth=breadth;
	}
	void Area()
	{
		float area=Length*Breadth;
		System.out.println("Area is: "+area);
	}
	void Perimeter()
	{
		float perimeter=2*(Length+Breadth);
		System.out.println("Perimeter is: "+perimeter);
	}
}
class Square extends Rectangle
{
	float Side;
	Square(float side)
	{
		super(side,side);
	}
}
public class RectSquare 
{

	public static void main(String[] args) 
	{
		Rectangle objrect=new Rectangle(6.4f,7.2f);
		System.out.println("Rectangle :");
		objrect.Area();
		objrect.Perimeter();
		Square objsqu=new Square(6.4f);
		System.out.println("Square :");
		objsqu.Area();
		objsqu.Perimeter();
		
	}

}
