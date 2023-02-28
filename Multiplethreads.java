//set9 que 1

class Multiplethreads  extends Thread 
{
    int n;
    Multiplethreads(int n) 
    {
        this.n = n;
    }
    public void run() 
    {
        for (int i = 0; i < n; i++) 
        {
            System.out.println(i);
            try 
            {
                Thread.sleep(1000);
            } catch (InterruptedException e) 
            {
                System.out.println("Something went Wrong "+e.getMessage());
            }
        }
    }
    public static void main(String[] args) 
    {
        Multiplethreads m1 = new Multiplethreads(4);
        Multiplethreads m2 = new Multiplethreads(10);
        new Thread(m1).start();
        new Thread(m2).start();
    }
}