
public class Complex 
{
	float realNo;
	float imagNo;
	Complex(float real,float imag)
	{
		realNo=real;
		imagNo=imag;
	}
	static void sum(Complex objComplex1,Complex objComplex2)
	{
		float totalreal=objComplex1.realNo+objComplex2.realNo;
		float totalimag=objComplex1.imagNo+objComplex2.imagNo;
		System.out.println("Sum of Complex Number: "+totalreal+" + "+totalimag+"i");
	}
	static void difference(Complex objComplex1,Complex objComplex2)
	{
		float totalreal=objComplex1.realNo-objComplex2.realNo;
		float totalimag=objComplex1.imagNo-objComplex2.imagNo;
		System.out.println("Difference of Complex Number: "+totalreal+" + "+totalimag+"i");
	}
	static void product(Complex objComplex1,Complex objComplex2)
	{
		float totalreal = (objComplex1.realNo * objComplex2.realNo) - (objComplex1.imagNo * objComplex2.imagNo);
        float totalimag = (objComplex1.realNo * objComplex2.imagNo) + (objComplex1.imagNo * objComplex2.realNo);
		System.out.println("Product of Complex Number: "+totalreal+" + "+totalimag+"i");
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter First Complex Number: ");
		System.out.println("Enter Real Number: ");
		float real1=Console.getFloat();
		System.out.println("Enter Imaginary Number: ");
		float imag1=Console.getFloat();
		Complex objComplex1= new Complex(real1,imag1);
		
		System.out.println("Enter Second Complex Number: ");
		System.out.println("Enter Real Number: ");
		float real2=Console.getFloat();
		System.out.println("Enter Imaginary Number: ");
		float imag2=Console.getFloat();
		Complex objComplex2= new Complex(real2,imag2);
		
		sum(objComplex1, objComplex2);
        difference(objComplex1, objComplex2);
        product(objComplex1, objComplex2);
	}

}
