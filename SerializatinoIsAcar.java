import java.io.*;
class Car implements Serializable
{
        int price;
        public Car(int price)
		{
                this.price = price;
        }
}
class Maruthi extends Car
{
         int modelno;
         public Maruthi(int price,int modelno)
		 {
                super(price);
                this.modelno =modelno;
         }
}
public class SerializationIsA1
{
          public static void main(String[] args)throws Exception
		  {
                  Maruthi m1 = new Maruthi(200,400);
                  System.out.println("price = " + m1.price);
                  System.out.println("modelno= " + m1.modelno);
                  FileOutputStream fos = new FileOutputStream("ee.ser");
                  ObjectOutputStream oos = new ObjectOutputStream(fos);
                  oos.writeObject(m1);
                  oos.close();
                  fos.close();
                  System.out.println("The object has been serialized");
                  FileInputStream fis = new FileInputStream("ee.ser");
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  Maruthi m2 = (Maruthi)ois.readObject();
                  ois.close();
                  fis.close();
                  System.out.println("The object deserialized");
                  System.out.println("price = " + m2.price);
                  System.out.println("modelno= " + m2.modelno);
          }
}