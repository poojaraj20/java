class MyTask{
synchronized public void add()
  {
   int i;
   for(i=0;i<5;i++)
   {
    System.out.println(i);
   }
  }
}

class Mythread extends Thread
{      
MyTask t;
Mythread(MyTask t){
this.t = t;
}
  public void run()
  {
 //this.add();
 //System.out.println("...");
 this.t.add();
 
  }
 
}
class Labexam2
{
   public static void main(String args[])
   {
  MyTask myt = new MyTask();
    Mythread t1=new Mythread(myt);
    Mythread t2=new Mythread(myt);
    t1.start();
    t2.start();
   }
 }
