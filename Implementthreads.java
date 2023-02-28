class Implementthreads implements Runnable 
{
    int n;
    Implementthreads(int n) 
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
                System.out.println("Something went Wrong " + e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        Implementthreads I1 = new Implementthreads(6);
        Implementthreads I2 = new Implementthreads(9);
        new Thread(I1).start();
        new Thread(I2).start();
    }
}