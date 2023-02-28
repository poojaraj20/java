import java.util.Scanner;
public class Pali
{
int n,flag=0,d,rev=0,a;
int checkpal()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the Number");
n=input.nextInt();
a=n;
while(a>0)
{
d=a%10;
rev=(rev*10)+d;
a=a/10;
}
if(n==rev)
{
flag++;
}
return flag;
}
void display()
{
if(flag!=0)
{
System.out.println("The Number is pallindrome");
}
else
{
System.out.println("Number is not Pallindrome");
}
}
public static void main(String args[])
{
Pal p=new Pal();
br.checkpal();
br.display();
}
}