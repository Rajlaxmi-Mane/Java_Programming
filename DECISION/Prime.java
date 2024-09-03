import java.util.*;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		 int i,j,num,t=0;
		 System.out.println("enter number");
		 num=s.nextInt();
		 for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				
				t=1;
				break;
			}

		}
		if(t==0)
		{
			
			System.out.println("no is Prime");
		}
		else
		{
			
			System.out.println("no is not Prime");
		}

	}
}
