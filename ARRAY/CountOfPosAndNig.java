class CountOfPosAndNig 
{
	public static void main(String[] args) 
	{
		int []a={-1,2,3,8,-4,-6,7,9};
	    int pc=0,nc=0;
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]>=0)
			{
				pc++;
			}
				else{
					nc++;
				}
		}
		System.out.println("positive numbers are = "+pc);
		System.out.println("negative numbers are = "+nc);
        System.out.println("Toatl number of elements = "+a.length);
	}
}
