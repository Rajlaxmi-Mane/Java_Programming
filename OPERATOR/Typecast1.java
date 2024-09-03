class Typecast1
{
	public static void main(String[] args) 
	{
		short s=345;
		byte b=(byte)s;
		
		int i=s;
		long l=s;
		float f=s;
		double d=s;
		char c=(char)s;

		 System.out.println(s);
		 System.out.println(b);
		 System.out.println(i);
		 System.out.println(l);
		 System.out.println(f);
		 System.out.println(d);
		 System.out.println(c);
	}
}

