import java.io.*;
import java.util.Scanner;
class Cricket implements Serializable
{
    String name;
    int age;
   
}
class Indiacricket
{
    public static void main(String[] args)throws Exception
    {
        Cricket  c1=new Cricket ();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the team name");
        c1.name=in.next();
        System.out.println("Enter the age");
        c1.age=in.nextInt();
        FileOutputStream fos=new FileOutputStream("telecast.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c1);
        FileInputStream fis=new FileInputStream("telecast.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Cricket c=(Cricket)ois.readObject();
        System.out.println("The name of team is"+c.name);
        System.out.println("age "+c.age);
           }
}