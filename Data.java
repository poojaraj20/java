import java.util.Scanner;
class Cstring
{
    String st;
    void display()
    {
        System.out.println(st);
    }
    void read()
    {
        System.out.println("Enter  String");
        Scanner sc=new Scanner(System.in);
        st=sc.nextLine();
    }
    boolean compare(String s1)
    {
        return st.equals(s1);
    }
    void concatenate(String s1)
    {
        System.out.println(st+s1);
        
    }
}
class Data
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Cstring obj=new Cstring();
        int ch=0;
        while(ch!=5)
        {
            System.out.println("1.Enter string");
            System.out.println("2.Display string");
            System.out.println("3.Compare");
            System.out.println("4.concatenate");
            System.out.println("5.Exit");
            System.out.println("Enter your option");
            ch=in. nextInt();
            switch(ch)
            { 
                case 1: obj.read();
                        break;
                case 2: obj.display();
                        break;
                case 3: System.out.println("Enter a string to compare");
                        String s1=in.next();
                        System.out.println(obj.compare(s1));
                case 4: System.out.println("Enter a String to concatenate");
                        // in.next();
                        s1=in.next();
                        obj.concatenate(s1);
                case 5: break;
                default:System.out.println("Wrong option");
            }
        }
    }
}