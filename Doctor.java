import java.util.Scanner;
class Hospital
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
class Doctor extends Hospital
{
    public static void main(String[] args)
    {
        Doctor  obj=new Doctor ();
         System.out.print(" Doctor Name is ");
         obj.read("Raju");
         System.out.println(obj.display());
    }
}
