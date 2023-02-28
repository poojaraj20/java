import java.util.Scanner;
class Swapp
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter valueof x:");
		int x=input.nextInt();
		System.out.println("Enter valueof y:");
		int y=input.nextInt();
		int b;
		b=x+y;
		x=b-y;
		y=b-x;
		System.out.println("valueof x:"+x);
		System.out.println("valueof y:"+y);
	}
}
		
		