//Program to implement ISA and HASA relationship. 

import java.util.Scanner;
class College
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
         System.out.println("College is "+obj.display());
    }
}