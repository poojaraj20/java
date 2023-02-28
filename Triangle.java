import java.util.Scanner;
interface Area{
    void cal_area(int b,int h);
}
class Shape implements Triangle
{
    public void cal_triangle(int x,int y)
    {
        float ans=(y*x)/2;
        System.out.println("The area is "+ans);
    }
}
class Triangle
{
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    Triangle obj=new Shape();
    System.out.println("Enter the x");
    int x=in.nextInt();
    System.out.println("Enter the y");
    int y=in.nextInt();
    obj.cal_triangle(x,y);
    }
}