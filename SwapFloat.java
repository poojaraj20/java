//WAP to implement a function using call by value to swap two float numbers.
import java.util.Scanner;
class number
{
    void test(float a,float b)
    {
	    float c=a;
	    a=b;
    	b=c;
	}
}
class callbyvalueswap
{
	public static void main(String args[])
    {
		number n=new number();
		float a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		a=sc.nextFloat();
		b=sc.nextFloat();
		System.out.println("before fn call :: a:"+a+" b:"+b);
		n.test(a,b);
		System.out.println("after fn call :: a:"+a+" b:"+b);
	}
}