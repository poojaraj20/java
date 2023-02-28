import java.util.Scanner;
class Maxnumber {
   public static void main(String[] args) {

      System.out.println("Enter three numbers");
      Scanner input = new Scanner(System.in);
 
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
 
      if ( a>b && a>c )
         System.out.println("a is  largest.");
      else if ( b>a && b>c )
         System.out.println("b is largest.");
      else if ( c>a && c>b )
         System.out.println("c is largest.");
      else   
         System.out.println("nothing is largest");
   }
}