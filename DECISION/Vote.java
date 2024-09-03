import java.util.*;
class Vote 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if (age>+18)
		{
			System.out.println("yes eligible:");
		}
		else
		{
			
			System.out.println("not eligible");
		}
	}
}
