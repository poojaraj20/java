import java.util.Scanner;

class Distance
{
    int inch,feet;
}
class Cloning1
{
public static void  main(String[] args)
{
    Distance ds=new Distance();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value for feet");
    ds.feet=sc.nextInt();
    System.out.println("Enter value for inch");
    ds.inch=sc.nextInt();
    Distance obj=new Distance();
    obj=ds;
    System.out.println("object one value");
    System.out.println(ds.feet+" and "+ds.inch);
    System.err.println(obj.feet+" and "+obj.inch);
}
}