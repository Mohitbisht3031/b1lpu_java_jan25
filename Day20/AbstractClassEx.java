package Day20;

// this is how we declare abstract class
abstract class Animal{
    // this is how we declare an abstract method
    abstract void speak();
}

class Dog extends Animal{

    void speak(){
        System.out.println("Dog barks!");
    }
}

public class AbstractClassEx {
    public static void main(String[] args) {
        // Animal obj = new Animal(); this will throw error
    }
}
