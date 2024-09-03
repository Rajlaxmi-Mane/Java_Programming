import java.util.*;
class Case 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character : ");
		char c=sc.next().charAt(0);
		if(c<='z' && c>='a')
		{
			
			System.out.println("its lowercase");
		}
		else
		{
			
			System.out.println("its uppercase");
		}

	}
}
