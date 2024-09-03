import java.util.*;
class LargerNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two no : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if (a>b)
		{
			System.out.println(a+" is larger than "+b);
		}
		else 
		{
			
			System.out.println(b+ " is larger than " +a);
		}
	}
}
