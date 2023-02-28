import java.util.Scanner;
class Trycatcharray
{
    public static void  main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int a=in.nextInt();
        int array[]=new int[a];
        System.out.println("Enter the elements to array");
        for(int i=0;i<a;i++)
        {
            try
            {
                array[i]=in.nextInt();
            }
               catch(NumberFormatException n)
            {
                System.out.println("Enter a valid number");
            }
            catch(Exception e)
            {
             System.out.println("Enter a valid number");  
            }
        }
    }
}