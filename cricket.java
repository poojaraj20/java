import java.io.*;
import java.util.Scanner;
class Cricket implements Serializable
{
    String name;
    int no_of_players;
   
}
class indiacricket
{
    public static void main(String[] args)throws Exception
    {
        Cricket  c1=new Cricket ();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the team name");
        c1.name=in.next();
        System.out.println("Enter the no of players");
        c1.no_of_players=in.nextInt();
        FileOutputStream fos=new FileOutputStream("telecast.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(t1);
        FileInputStream fis=new FileInputStream("telecast.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Cricket c=(Cricket)ois.readObject();
        System.out.println("The name of team is"+t.name);
        System.out.println("The no of player "+t.no_of_players);
           }
}