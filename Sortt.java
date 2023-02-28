import java.util.Scanner;
public class Sortt
{
 public static void main(String args[]){
 int size,temp;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Size of Array:");
 size=sc.nextInt();
 int array[]=new int[size];
 System.out.println("Enter elements in array:");
 for(int i=0;i<size;i++)
  {
   array[i]=sc.nextInt();
  }sc.close();
 for(int i=0;i<size;i++)
{
 for(int j=i+1;j<size;j++)
{
 if(array[i]>array[j]){
temp=array[i];
array[i]=array[j];
array[j]=temp;
}
 
}
}
System.out.println("Arrays Elements in Ascending order are:");
 for(int i=0;i<size-1;i++)
{
System.out.println(array[i]+"|");
}
System.out.println(array[size-1]);
}
}