import java.util.Scanner;
public class Stat
{
static int i;
public static void easy(int num)
{
for(i=0;i<=num;i++)
{
if(i%2==0)
{
System.out.print(i+" ");
}
}
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Number");
n=sc.nextInt();
easy(n);
}
}