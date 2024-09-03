import java.util.*;
class Scenario

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("is it raining outside type y for yes or n for no");
		char str=sc.next().charAt(0);
		if(str=='n')
		  {
			
			System.out.println("Take a bike");
		  }
		else
		{
			
			System.out.println("take a car");
		}

	}
}
