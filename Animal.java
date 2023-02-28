
class Animal {
System.out.println("ISA relationship:");
    
}

class Dog extends Animal {
    
}


class Engine {
    
}

class Car {
System.out.println("HASA relationship:");
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
}
