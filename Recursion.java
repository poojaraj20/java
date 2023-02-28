import java.util.Scanner;
public class Recursion
{
static int count=0;
public static void main(String args[])
{
int n;
Scanner input=new Scanner(System.in);
System.out.println("enter the number");
n=input.nextInt();
number(n);
}
public static void number(int num)
{
if(num>0)
{
count++;
System.out.println("Number "+count+" is "+num);
System.out.println("Recursion "+count);
number(num/10);
}
else
{
System.out.println("number of recursion "+count);
}
}
}