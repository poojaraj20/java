import java.util.Scanner;
 class Twodarray
 {
 public static void main(String[] args)
 
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number of row");
 int row=sc.nextInt();
  System.out.println("enter the number of colunm");
  int col=sc.nextInt();
  
  int ar[][]=new int[row][col];
   System.out.println("enter the "+row+"*"+col+"matrix");
   for(int i=0;i<row;i++)
   {
   for(int j=0;j<col;j++)
   {
   ar[i][j]=sc.nextInt();
   }
   }
   System.out.println("the value of array");
   for(int i=0;i<row;i++)
   {
   for(int j=0;j<row;j++)
   {
   System.out.println(ar[i][j] +"\t");
   }
   int i,j,sumofrow,sumofcol,k,l,m;
   k=1;
   for(i=0;i<row;i++)
   {
   sumofrow=0;
   for(j=0;j<col;j++)
   {
   sumofrow=sumofrow+ar[i][j];
   }
    System.out.println("sum of "+k+" is "+sumofrow);
	k++;
	}
	m=1;
	for(i=0;i<row;i++)
	{
	sumofcol=0;
		for(j=0;j<col;j++)
	{
	sumofcol=sumofcol+ar[i][j];
	}
	 System.out.println("sum of "+m+" is "+sumofcol);
	 m++;
	 }
	 }
 }
 }
 
	 
	
	
	
	
	
  
  
 