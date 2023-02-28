import java.io.*;  
import java.net.*;  
public class Sserver {  
public static void main(String[] args){  
try{  
ServerSocket s=new ServerSocket(6666);  
Socket so=s.accept();  
DataInputStream dis=new DataInputStream(so.getInputStream());  
DataOutputStream dout=new DataOutputStream(so.getOutputStream());
String str=(String)dis.readUTF();  
if(str !=null)
{
System.out.println("message= "+str);
dout.writeUTF(" i am");
}
s.close();  
}
catch(Exception e){System.out.println(e);}  
}  
}
