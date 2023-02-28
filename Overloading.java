import java.util.Scanner;
class Reuse
{
	void max(int a,int b)
	{
		if(a>b)
		{
			System.out.println(a+" is greater");
		}
		else
		{
			System.out.println(b+" is greater");
		}
	}
}
class Reuseof extends Reuse
{
	void max(int a,int b,int c)
	{
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
}
public class Overloading
{
	public static void main(String args[])
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your 1 number");
		x=sc.nextInt();
		System.out.println("enter your 2 number");
		y=sc.nextInt();
		System.out.println("enter your 3 number");
		z=sc.nextInt();
		Reuseof r=new Reuseof();
		r.max(x,y);
		r.max(x,y,z);
	}
}