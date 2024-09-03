import java.util.Arrays;
class Sort 
{
	public static void main(String[] args) 
	{
		int []a={-1,2,3,8,-4,-6,7,9};
		System.out.println("Elements before sorting");
		for (int i=0;i<a.length ;i++ )
		{
			System.out.println(a[i]);
		}
	    Arrays.sort(a);
		System.out.println("Sorted elements are ");
		for (int i=0;i<a.length ;i++ )
		{
			System.out.println(a[i]);
		}
		System.out.println("Sorted elements in descending order  are ");
		for (int i=a.length-1;i>=0;i-- )
		{
			System.out.println(a[i]);
		}
		
	}
}
