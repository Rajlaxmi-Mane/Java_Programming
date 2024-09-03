import java.util.*;
class ReturnSum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int [] arr=new int[size];
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=s.nextInt();
		}
		System.out.println("sum of even number ="+sum(arr));
	}
	public static double sum(int[] a){
		int sum=0;
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]%2==0){
				sum=sum+a[i];
			}
		}
		return sum;
	}
}
