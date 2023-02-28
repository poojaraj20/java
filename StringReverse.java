import java.util.Scanner;
class String
{
    String s;
    String(String value)
    {
        s=value;
    }
    void display()
    {
        System.out.println("The string is "+s);
    }
    void revdisplay()
    {
        String revstr="";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s.charAt(i);
            revstr=ch+revstr;
        }      
        System.out.println("The reverse "+revstr);
    }
}
class StringReverse
{
    public static void main(String[] args)
    {
            Scanner in=new Scanner(System.in);
            System.out.print("Enter the string: ");
            String str=in.next();
            Stringss obj=new Stringss(str);
            obj.display();
            obj.revdisplay();
    }
}
