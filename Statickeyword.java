class Statickeyword
{
    static int a = 10;
    static void display()
    {
		
        System.out.println("This is a static function");
    }
    public static void main(String[] args) 
    {
        Statickeyword obj = new Statickeyword();
        Statickeyword.display();
        System.out.println(Statickeyword.a);
        System.out.println(obj.a);
      Statickeyword.a = 20;
        System.out.println(Statickeyword.a);
        System.out.println(obj.a);
    }
}                                          