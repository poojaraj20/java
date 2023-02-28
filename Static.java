//Program to explain static keyword with different usage including function

class Static
{
    static int a = 5;
    static void display()
    {
        System.out.println(" static function");
    }
    public static void main(String[] args) 
    {
        Static obj = new Static();
        Static.display();
        System.out.println(Static.a);
        System.out.println(obj.a);
        Static.a = 30;
        System.out.println(Static.a);
        System.out.println(obj.a);
    }
}