import java.util.Scanner;
import java.io.*;
class Canteen implements Serializable
{
    static String order;
    static int price;
}
class Collegecanteen
{
    public static void main(String[] args)throws IOException,ClassNotFoundException
    {
        Scanner sc=new Scanner(System.in);
        Collegecanteen c=new  Collegecanteen();
        System.out.println("Enter the order");
	    c.order=sc.next();
        System.out.println("Enter the price");
        c.price=sc.nextInt();
        FileOutputStream foss=new FileOutputStream("Collegecanteen.txt",true);
        ObjectOutputStream ooss=new ObjectOutputStream(foss);
        ooss.writeObject(c);
        ooss.close();
        sc.close();
        FileInputStream fiss=new FileInputStream("Collegecanteen.txt");
        ObjectInputStream oiss=new ObjectInputStream(fiss);
        Collegecanteen cc=(Collegecanteen)oiss.readObject();
        System.out.println("The name of the order is "+cc.order);
        System.out.println("The name of the pricr is "+cc.price);
        oiss.close();
        fiss.close();
    }
}