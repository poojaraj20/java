//Program to implement ISA and HASA relationship. 

import java.util.Scanner;
class Collage
{
    String name;
    void read(String name)
    {
        this.name=name;
    }
    String display()
    {
        return this.name;
    }
}
class Students extends Collage
{
    public static void main(String[] args)
    {
         Students obj=new Students();
         System.out.println("Name is POOJA RAJ");
         obj.read("Rajagiri");
         System.out.println("Collage is "+obj.display());
    }
}