import java.util.*;
class Switch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n)
		{
			// WE CANNOT USE CASE INSIDE ONTHER CASE;

			case 1:{
				case 2:
				 System.out.println("hii");
			}
			break;
			case 3:
				System.out.println("g");
			break
		}
	}
}
