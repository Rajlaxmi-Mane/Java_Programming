class IncOp2 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20 + ++a + a++;
		int c=25 + a++ + b++ + ++a + b++;
		int d=30+ ++b + a++ + ++c + c++;

		System.out.println(a + ++c);
		System.out.println(b + d++);
		System.out.println(c + ++d + c++);
		System.out.println(d + c++ + ++a);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}
}
