class Thread1 extends Thread
{
public void run()
{
}
synchronized public void add()

{
int i;
for(i=0;i<3;i++)
{
System.out.println(i);
}
}
}
class Threadlab
{
public static void main(String args[])
{
try
{
Thread1 t1=new Thread1();
Thread1 t2=new Thread1();
t1.start();
t2.start();
t1.add();
t2.add();
}
catch(Exception e)
{
System.out.println(e);
}
}
}

