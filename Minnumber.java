import java.util.Scanner;
public class Minnumber
{
public static void main(String[] args)
{
	int num1,num2,num3,smallest;
System.out.println("enter the three numbers");
Scanner input=new Scanner(System.in);
num1=input.nextInt();

 num2=input.nextInt();

num3=input.nextInt();


smallest=num3 < (num1< num2 ? num1 : num2) ? num3:(( num1< num2)? num1 : num2);
System.out.println("the smallest number:"+smallest);
}
}          
