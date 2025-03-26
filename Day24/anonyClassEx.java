package Day24;

interface Animal {
    void speaks();
}
public class anonyClassEx {
    public static void main(String[] args) {
        Animal obj = new Animal() {
            @Override
            public void speaks() {
                System.out.println("Animal Speaks!");
            }
        };
        obj.speaks();
    }
}
