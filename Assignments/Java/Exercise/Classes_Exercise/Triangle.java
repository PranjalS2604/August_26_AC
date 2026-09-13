
public class Triangle 
{
	int Twidth;
	int Theight;
	int Tbase;
	Triangle(int base,int height,int hypo)
	{
		Tbase=base;
		Theight=height;
		Twidth=hypo;
	}
	double Area()
	{
		double area=(Tbase*Theight)/2;
		return area;
	}
	double perimeter()
	{
		double perimeter=Tbase+Twidth+Theight;
		return perimeter;
	}
	public static void main(String[] args) 
	{
		Triangle objtriangle=new Triangle(3,4,5);
		
		double area=objtriangle.Area();
		System.out.println("Area Of Triangle is: "+area);
		System.out.println();
		double perimeter=objtriangle.perimeter();
		System.out.println("Perimeter Of Triangle is: "+perimeter);

	}

}
