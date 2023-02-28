class Task
{
synchronized public void add()
  {
   int i;
   for(i=0;i<4;i++)
   {
    System.out.println(i);
   }
  }
}

class Mythread extends Thread
{      
Task t;
Mythread(Task t){
this.t = t;
}
  public void run()
  {
 this.t.add();
 
  }
class Labpooja
{
public static void main(String args[])
{
  Task t = new Task();
    Mythread t1=new Mythread(t);
    Mythread t2=new Mythread(t);
    t1.start();
    t2.start();
   }
 }
}

