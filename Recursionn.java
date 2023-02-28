//WAP to find the factorial of n, using recursion. 

import java.util.Scanner;
class Recursionn
{
    int oneton(int x,int i)
    {
        if(i<= x)
        {
            System.out.print(i+" ");
            return(oneton(x,++i));
        }
        return 1;
    }
    void ntoone(int n)
    {
        if (n == 0) return;
        System.out.print(n + " ");
        ntoone(n - 1);
    }
    public static void main(String[] args)
    {
        Scanner re=new Scanner(System.in);
        Recursionn obj=new Recursionn();
        System.out.println("Enter the number");
        int n=re.nextInt();
        obj.oneton(n,1);
        System.out.println();
        obj.ntoone(n);
    }
}