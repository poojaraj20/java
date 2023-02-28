class Animals {
    public final void move() {
        System.out.println("Animals can move.");
    }
}

class Dog extends Animals {
    // This will cause a compile-time error
    // because the move method is marked as final in the superclass
    @Override
    public void move() {
        System.out.println("Dogs can move.");
    }
}