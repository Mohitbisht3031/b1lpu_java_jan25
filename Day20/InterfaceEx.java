package Day20;

// this is how an interface is made
interface Animal{
    default void speak(){
        System.out.println("Animal");
    }
}

interface Mamel extends Animal{
    default void speak(){
        System.out.println("have 4 legs");
    }
}

// this is how an interface's implementation is done and way we achive multiple inheritance
class Dog implements Animal,Mamel{
    public void speak(){
        System.out.println("Dog Barks");
    }
    // public void noOflegs(){
    //     System.out.println("It have 4 legs");
    // }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.speak();
    }
}
