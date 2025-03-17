package Day19;

class Animal{
    Animal(){
        System.out.println("Animal comp");
    }
    void speak(){
        System.out.println("Animal speaks!");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog comp");
    }
    @Override //annotation
    void speak(){
        System.out.println("Dog barks!");
    }
}

class Puppy extends Dog{
    Puppy(){
        System.out.println("PC");
    }
    @Override //annotation
    void speak(){
        super.speak();
    }

    @Override
    public String toString() {
        return "this is child of Animal and a dog class";
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
}

public class overRiding {
    public static void main(String[] args) {
        // Dog d = new Dog();
        // d.speak();
        Puppy obj = new Puppy();
        obj.speak();
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
    }
}
