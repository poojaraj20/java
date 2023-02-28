import java.util.Scanner;
 class Factorial1
{
int fact(int n) 

{
if(n>0)
{
  return n*fact(n-1) ;
}
else
{
return 1;
}
}

public static void main(String[] args){
Scanner sc =new Scanner(System.in);
Factorial1 obj= new Factorial1();
int n;
System.out.println("enter the number:");
n=sc.nextInt();
System.out.println("Factorial of "+n+" is "+obj.fact(n));
}
}

