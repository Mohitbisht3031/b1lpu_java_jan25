package Day27;

// This is how a generic class will look like
class Multiply<T>{
    T v1;
    T v2;

    Multiply(T v1,T v2){
        this.v1 = v1;
        this.v2 = v2;
    }

    // This is how a generic method will look like
    <T> prod(){
        return v1*v2;
    }

}

public class genericClass {
    public static void main(String[] args) {
        Multiply<int>m1 = new Multiply(2, 3);
        Multiply<double>m2 = new Multiply(2.5, 3.5);
        System.out.println("Rsult of prod is int "+ m1.prod());
        System.out.println(m2.prod());
    }
}
