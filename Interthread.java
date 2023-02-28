class  Thread
{
    synchronized void printTable(int n) 
    {
              for (int i = 1; i <=3; i++) 
        {
            System.out.println(n * i);
            try 
            {
                Threads.sleep(400);
            } catch (InterruptedException e) 
            {
                System.out.println(e.getMessage());
            }
        }

    }
}

class MyThread1 extends Thread 
{
    Thread t;

    MyThread1(Thread t) 
    {
        this.t = t;
    }

    public void run() 
    {
        t.printTable(1);
    }

}
class MyThread2 extends Thread 
{
    Thread t;

    MyThread2(Thread t) 
    {
        this.t = t;
    }

    public void run() 
    {
        t.printTable(100);
    }
}
class Interthreads
{
    public static void main(String args[]) 
    {
        Thread obj = new Thread();//only one object
        MyThread1 m1 = new MyThread1(obj);
        MyThread2 m2 = new MyThread2(obj);
        m1.start();
        m2.start();
    }
}