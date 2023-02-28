import java.util.Scanner;
public class Evennstatic
{
static void even(int a)
{
for(int i=1;i<=a;i++)
{
if(i%2==0)

System.out.print(i+"  ");
}
}
public static void main(String[]args)
{


Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.print("enter the even number:");
even(n);
}
}

