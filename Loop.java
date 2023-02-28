import java.util.Scanner;
public class Loop
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Starting Value");
i=sc.nextInt();
System.out.println("Enter the Ending value");
j=sc.nextInt();
while(i<=j)
{
System.out.print(+i+" ");
i++;
}
}
}
