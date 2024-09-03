class Static 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	static
	{
		main(null);
		demo();
		
	  for (int i=0;i<5;i++)
	  {
		  if(i%2==0)
		  {
		  System.out.println(i);
		  }
	  }
	}
	public static void demo()
	{
		System.out.println("hii");
	}
}
