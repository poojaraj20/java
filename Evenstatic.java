import java.util.Scanner;
class Evenstatic 
{
    static void printEven(int n)
    {
        for(int i=0;i <=n; i+=2)
        {
            System.out.println(i);
        }
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Enter the Limit of the Numbers");
        int n=input.nextInt();
        System.out.println("The numbers are");
        Evenstatic.printEven(n);
        
    }
}