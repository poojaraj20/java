import java.util.Scanner;
import java.lang.Math;
class Squarerroot
{
 double x;
 double sqr(Squarerroot obj)
 {
   double s=Math.sqrt(x);
   return s;
 }
 public static void main(String args[])
 {
   Scanner sr=new Scanner(System.in);
   Squarerroot obj=new Squarerroot();
   System.out.println("Enter a number:");
    obj.x=sr.nextInt();
   System.out.println("Square root of "+obj.x+" is: "+ obj.sqr(obj));
 }
}