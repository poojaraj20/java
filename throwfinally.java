import java.util.Scanner;
class throwfinally 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        try
        {
            int n = sc.nextInt();
        }catch (Exception e)
        {
            System.out.println("Enter a Valid Number");
        }finally
        {
            System.out.println("exit");
        }
    }
}