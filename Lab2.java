class Thread extends Threads
{
public void run()
{
}
synchronized public void add()
{
int i;
for(i=0;i<=3;i++)
{
System.out.println(i);
}
}
}
class Lab2
{
public static void main(String args[])
{
try
{
Threads t1=new Threads();
Threads t2=new Threads();
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
