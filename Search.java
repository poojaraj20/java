import java.util.Scanner;
class Search
{
  public static void main(String args[])
  {
     int size,i,num,found=0;
     Scanner input=new Scanner(System.in);
     System.out.println("Enter Size Of Array:");
     size=input.nextInt();
     int a[]=new int[100];
     System.out.println("Enter The Array Elements");
     for(i=0;i<size;i++)
        {
            a[i]=input.nextInt();

	}
     System.out.println("Enter The Number  To Search:");
     num=intput.nextInt();  
     for(i=0;i<size;i++)
        {
            if(num==a[i])
            {
	          System.out.println("The Position Is:"+i);
		     found=1;
	 	  break;
            }
       }
if(found==0)
	System.out.println("Not Found");

  }
}

