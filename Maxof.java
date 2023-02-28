import java.util.Scanner;
public class Maxof
{
	public static void max(int a,int b)
	{
		System.out.print("Comapring Two Numbers ");
		if(a>b)
		{
			System.out.println(a+" is greater");
		}
		else
		{
			System.out.println(b+" is greater");
		}
	}
	public static void max(int a,int b,int c)
	{
		System.out.print("Comapring Three Numbers ");
		if(a>b&&a>c)
		{
			System.out.println(a+" is greater");
		}
		else if(b>c)
		{
			System.out.println(b+" is greater");
		}
		else
		{
			System.out.println(c+" is greater");
		}
	}
	public static void main(String args[])
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First Number");
		x=sc.nextInt();
		System.out.println("Enter your second Number");
		y=sc.nextInt();
		System.out.println("Enter your Third Number");
		z=sc.nextInt();
		max(x,y);
		max(x,y,z);
	}
}