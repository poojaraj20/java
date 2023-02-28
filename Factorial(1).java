import java.util.Scanner;
public class Factorial1
{
void fact(int n) 
if(n>0)
{
n*fact(n-1)
else
{
System.out.print(+n "  ");
}
}
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
Factorial(1) obj= new Factorial(1);
int n
System.out.print("enter the number:");
n=sc.nextInt();
System.out.print("Factorial of "+n+" is "obj.fact);
}
}

