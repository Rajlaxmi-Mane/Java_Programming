import java.util.*;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter number :");
		int num =sc.nextInt();
		if (num %2==0)
		{
			System.out.println(num+" is a even number");
		}
		else
		{
			System.out.println(num + " is a odd no ");
		}
		
	}
}
