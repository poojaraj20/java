import java.util.Scanner;
public class Prin
{
public static void rec(int num)
{
if(num>0)
{
System.out.print(num+" ");
num=num-1;;
rec(num);
}
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Number");
n=sc.nextInt();
rec(n);
}
}