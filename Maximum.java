import java.util.Scanner;
 
public class Maximum
{
 
    public static void main(String[] args) {
        int a, b, c, max;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Integer");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a > b) 
		{
            if (a > c)
                max = a;
            else
                max = c;
        } else {
          
            if (b > c)
                max = b;
            else
                max = c;
        }
        System.out.println("Largest Number : " + max);
    }
}