import java.io.*;


public class DeserializationExample {
public static void main(String[] args) throws IOException, ClassNotFoundException 
{
// Create an object of FileInputStream class to connect file.txt file.
     FileInputStream fis = new FileInputStream("D:\\file1.txt");	

// Create an object of ObjectInputStream to connect with fis.
     ObjectInputStream ois = new ObjectInputStream(fis);
   
   Object obj = ois.readObject(); // Reading objects.
   College clg = (College)obj; // Converting to College.
   
   System.out.println("Name: " +clg.name);
   System.out.println("Location: " +clg.location);
 }
}