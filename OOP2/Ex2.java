class Ex2 
{
	static int id=101;
	public static void main(String[] args) 
	{
		System.out.println(id);
		demo();
	}
	public static void demo()
	{
		System.out.println(Ex1.a);
		System.out.println(Ex1.b);
		Ex1.test();
	}
	static {
		System.out.println("welcome");
	}
}
