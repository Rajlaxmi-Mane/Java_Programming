class IncOp
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20 + ++a;
		int c=a++ + b++;
		int d=++b + a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
