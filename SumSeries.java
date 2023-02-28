import java.util.Scanner;
public class SumSeries
{
public static void main(String args[])
{
int n,i,sum1=0,sum2=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter the Limit");
n=input.nextInt();
i=1;
while(i<=n)
{
sum1=sum1+i;
sum2=sum2+sum1;
i++;
}
System.out.println("Sum of the series is:"+sum2);
}
}
