
public class Rectangle 
{
	int length;
	int breadth;
	Rectangle(int len,int side)
	{
		length=len;
		breadth=side;
	}
	double area()
	{
		double area=length*breadth;
		return area;
	}
	public static void main(String[] args) 
	{
		Rectangle objRect1=new Rectangle(4,5);
		Rectangle objRect2=new Rectangle(5,8);
		double area1=objRect1.area();
		System.out.println("Area Of Rectangle 1 is: "+area1);
		System.out.println();
		double area2=objRect2.area();
		System.out.println("Area Of Rectangle 2 is: "+area2);

	}

}
