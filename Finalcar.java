class Vehicle
{
	Vehicle()
	{
		System.out.println("Vehicle wheel");
	}
	final void eat()
	{
		System.out.println("vehicle speed");
	}
}
class Car extends Vehicle
{
	Car()
	{
		System.out.println("Car wheel");
	}
	void speed()
	{
		System.out.println("Car speed");
	}
}
class Finalcar
{
	public static void main(String args[])
	{
		Car c=new Car();
		c.speed();
	}
}