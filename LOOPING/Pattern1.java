class Pattern1
{
	public static void main(String[] args) 
	{
		char ch='a';
		int a=1;
		for(int i=1; i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				if(i%2==0)
				{
					System.out.print(a+" ");
					a++;

				}
				else
				{
					System.out.print(ch+" ");
					ch++;
				}

			}
			System.out.println();

		}
	}
}
