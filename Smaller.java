import java.util.Scanner;
 public class Smaller
{
        public static void main(String args[])
        {
              int a,b,c;
              Scanner sc=new Scanner(System.in);
	         System.out.println("Enter three numbers:");
              a=sc.nextInt();
              b=sc.nextInt();
              c=sc.nextInt();
	
	             if(a< b && a < c)
	                {
		              System.out.println("The Smallest Is:"+a);
	                }
	             else if(b<c)
	                {
		               System.out.println("The Smallest Is:"+b);
	                }
	             else
	                {
		               System.out.println("The Smallest Is:"+c);
	                }	
         }
}