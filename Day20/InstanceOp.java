package Day20;

class Animal{}
class Dog extends Animal{}

public class InstanceOp {
    public static void main(String[] args) {
        Dog obj = new Dog();
        if(obj instanceof Animal)System.out.println("yes");
        else System.out.println("No");
    }
}
