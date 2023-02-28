import java.util.Scanner;
class Sortelement
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter the element");
int a =input.nextInt();
System.out.println("enter the "+a );
int arr[]=new int[a];

for(int i=0;i<a;i++)
{
arr[i]= input.nextInt();
}
int temp=0;
System.out.println("sort element is");
for(int i=0;i<a;i++)
{
for(int j=0;j<a;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<a;i++)
{
 System.out.println(arr[i]+ "\t");
 }
}
}