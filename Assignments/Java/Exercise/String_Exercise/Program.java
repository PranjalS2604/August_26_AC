
public class Program 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String1: ");
		String str1=Console.getString();
		int length1=str1.length();
		
		System.out.println("Enter the String2: ");
		String str2=Console.getString();
		int length2=str2.length();
		
		//FIND POSITION CHARACTER
		System.out.println("Original String:"+str1);
		System.out.println("Enter index: ");
		int index=Console.getInt();
		if(index >= 0 && index < length1)
			System.out.println("The Character at position "+index+" is: "+str1.charAt(index));
		else
			System.out.println("Index not found");
		
		//COMPARE STRING
		System.out.println("String1:"+str1);
		System.out.println("String1:"+str2);
		if(str1.compareTo(str2)==0)
			System.out.println(str1+" is equal to "+str2);
		else if(str1.compareTo(str2)<0)
			System.out.println(str1+" is less than "+str2);
		else
			System.out.println(str1+" is more than "+str2);
		
		//END STRING
		System.out.println("Enter Suffix: ");
		String suffix=Console.getString();
		boolean str1ends=str1.endsWith(suffix);
		boolean str2ends=str2.endsWith(suffix);
		System.out.println(str1+" ends with "+suffix+" ? "+str1ends);
		System.out.println(str2+" ends with "+suffix+" ? "+str2ends);
		
		//REPLACE STRING
		String str="The quick brown fox jumps over the lazy dog.";
		String newString=str.replace("fox","cat");
		System.out.println(newString);
		
		//CONVERT UPPERCASE
		String strupper=str1.toUpperCase();
		System.out.println(strupper);
		
		//REVERSE STRING
		String str3="The quick brown fox jumps over the lazy dog.";
		String reverse="";
		for(int iTemp=length1-1;iTemp>=0;iTemp--)
		{
			reverse += str3.charAt(iTemp);
		}
		System.out.println("Reverse of String is : "+reverse);
		 
		//method-2 using stringbuffer
		StringBuffer sb=new StringBuffer();
		
		//System.out.println(sb.reverse());
		
		for(int iTemp=length1-1;iTemp>=0;iTemp--)
		{
			sb.append(str.charAt(iTemp));
		}
		System.out.println(sb);
	}

}
