public class datatypes
{
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		boolean h;
	public static void main(String args[])
	{
		datatypes data=new datatypes();

		System.out.println("--- Default Values ---");
        	System.out.println("byte: " + data.a);
        	System.out.println("short: " + data.b);
        	System.out.println("int: " + data.c);
        	System.out.println("long: " + data.d+"L");
        	System.out.println("float: " + data.e+"f");
        	System.out.println("double: " + data.f);
        	System.out.println("char: \\u" + String.format("%04x", (int) data.g));
        	System.out.println("boolean: " + data.h);
	}
}