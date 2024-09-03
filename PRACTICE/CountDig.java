import java.util.*;
class CountDig 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num,count=0;
		System.out.println("enter any number:");
		num=sc.nextInt();
		
		while(num!=0)
		{
			num= num /10;
            count++;
			
		}
        System.out.println("Count of digit is : "+count);
		
	}
}
