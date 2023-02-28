import java.io.*;
import java.net.*;
class Myclient
{
    public static void main(String[] args)
    {
        try
        {
            Socket so=new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(so.getOutputStream());
            dout.writeUTF("haii");
            DataInputStream dis=new DataInputStream(so.getInputStream());
            String str=(String)dis.readUTF();  
            System.out.println("message= "+str);
            dout.flush();
            dout.close();
            so.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}