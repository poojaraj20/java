class Product
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i;
		int p=1;
		for(i=1;i<=n;i++)
		{
			p=p*i;
		}
		System.out.print("The Product of 1st "+n+" numbers is "+p);	
	}
}