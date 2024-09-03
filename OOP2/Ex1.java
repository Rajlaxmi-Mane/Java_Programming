class Ex1
{
	static int a=10;
	static int b;
	public static void test()
	{
		System.out.println(a);
		System.out.println(b);
	}
	static{
	   b=25;
	}
	static{
	  System.out.println("hii");
	  System.out.println(a);
	  System.out.println(b);

	}
}
