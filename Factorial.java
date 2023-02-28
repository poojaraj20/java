import java.util.Scanner;
public class Factorial
{
public static void main(String args[])
{
int n,i,f=1;

double sum=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter Your limit");
n=input.nextInt();
for(i=1;i<=n;i++)
{
f=f*i;
sum=sum+((double)i/f);
}
System.out.println("Sum of the Series is:"+sum);
}
}