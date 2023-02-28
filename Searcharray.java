import java.util.Scanner;
public class Searcharray
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter the element in array");
int a=input.nextInt();
int array[]=new int[a];
System.out.println("enter "+a+" elemnt");
for(int i=0;i<a;i++)
{
array[i]=input.nextInt();
}
System.out.println("enter tye searched element");
int s=input.nextInt();
for(int i=0;i<a;i++)
{
if(array[i]==s)
{
System.out.println("the element in array is "+array[i]);
break;
}
else
{
System.out.println("the elemnt not found");
}
}
}
}

