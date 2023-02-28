import java.util.Scanner;
class Maxthree
{
    int max(int a,int b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    int max(int a,int b,int c)
    {
        if( a >=b )
        {
            if( a >= c)
            {
                return a;
            }
            else
            {
                return c;
            }
        }
        else
        {
            if( b >= c)
            {
                return b;
            }
            else
            {
                return c;
            }
        }
    }
    public static void main(String[] args)
    {
	int a,b,c;
        Scanner sc=new Scanner(System.in);
        Maxthree obj=new Maxthree();
        System.out.println("Enter two numbers");
         a=sc.nextInt();
        b=sc.nextInt();
        c=0;
        c=obj.max(a,b);
        System.out.println("The maximum of "+a+" and "+b+" is "+c);
        System.out.println("Enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int d=0;
        d=obj.max(a,b,c);
        System.out.println("The maximum of "+a+","+b+" and "+c+"is " +d);
    }
}