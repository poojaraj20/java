import java.io.*;
class College  implements Serializable 
{
  String name;
  String location;
}
public class SerializationExample
 {
public static void main(String[ ] args) throws IOException 
{
    College clg = new College();
     clg.name = "Rajagiri";
     clg.location = "Kalamassery";

     FileOutputStream fos = new FileOutputStream("D:\\file.txt");// Create an object of FileOutputStream class to connect file1.txt file.
  
     ObjectOutputStream oos = new ObjectOutputStream(fos);// Create an object of ObjectOutputStream class to connect with fos.
   
     oos.writeObject(clg);// Call writeObject() method of ObjectOutputStream class.
     oos.flush();
     oos.close();
     System.out.println("Serialization is done successfully");
  }
}