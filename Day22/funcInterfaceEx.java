package Day22;

@FunctionalInterface
interface Animal {
    void Speaks();
}

@FunctionalInterface
interface addNums {
    int sum(int a,int b);
}

public class funcInterfaceEx {
    public static void main(String[] args) {
        Animal obj = () -> System.out.println("Animal Speaks!"); // Lambda ex/function
        obj.Speaks();

        addNums obj2 = (int a,int b) -> {return a+b;};
        System.out.println(obj2.sum(5, 2));
    }
}
