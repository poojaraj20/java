//Create a class for employees having eno,ename and esal as data members.  Provide functions for reading and displaying employee details. (Accept information of n employees in the main function, display the same and search for an emp (using eno)).

import java.util.Scanner;
class Employee
{
    int eno,esal;
    String ename;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the eno");
        eno=sc.nextInt();
        System.out.println("Enter the name");
        ename=sc.next();
        System.out.println("Enter the esal");
        esal=sc.nextInt();
    }
    void display()
    {
        System.out.println("The eno is: "+eno);
        System.out.println("The name is: "+ename);
        System.out.println("The esal is: "+esal);
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n=in.nextInt();
        Employee[] e = new Employee[n];
        for(int i=0;i<n;i++)
        {
            e[i]= new Employee();
            e[i].read();
        }
        for(int i=0;i<n;i++)
        {
            e[i].display();
        }
        int ch=0;
        while(ch!=3)
        {
            System.out.println("1.Display all Employees");
            System.out.println("2.search Employees");
            System.out.println("3.Exit");
            System.out.println("Enter your option");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:for(int i=0;i<n;i++)
                        {
                            e[i].display();
                        }
                        break;
                case 2: System.out.println("Enter the eno number");
                        int number=in.nextInt();
                        for(int i=0;i<n;i++)
                        {
                            if(e[i].eno==number)
                            {
                                e[i].display();
                            }
                        }
                        break;
                default:System.out.println("Worng option");
            }
        }
    }    
}
