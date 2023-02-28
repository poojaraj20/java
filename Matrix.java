import java.util.Scanner;
public class Matrix
{
public static void main(String args[])
{
int i,j,r,c,rsum,csum;
Scanner input=new Scanner(System.in);
System.out.println("Enter the Rows");
r=input.nextInt();
System.out.println("Enter the colunm");
c=input.nextInt();
int a[][]=new int[r][c];
System.out.println("Enter the Matrix Elements");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=input.nextInt();
}
}
System.out.println("2D Array is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(+a[i][j]+"\t");
}
System.out.println();
}
System.out.println("Row Sum is:");
for(i=0;i<r;i++)
{
rsum=0;
for(j=0;j<c;j++)
{
rsum=rsum+a[i][j];
}
System.out.println("Sum of"+(i+1)+" Row:"+rsum);
}
System.out.println("Column Sum is:");
for(i=0;i<r;i++)
{
csum=0;
for(j=0;j<c;j++)
{
csum=csum+a[j][i];
}
System.out.println("Sum of"+(i+1)+" Column:"+csum);
}
}
}