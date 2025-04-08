package Day28;

import java.util.ArrayList;
import java.util.List;

// This is how a generic class will look like
class Multiply<T>{
    T v1;
    T v2;

    Multiply(T v1,T v2){
        this.v1 = v1;
        this.v2 = v2;
    }

    // This is how a generic bounded method will look like
    <T extends Number> prod(){
        return v1*v2;
    }
}

class random{
    public void display(List<?>l){
        for(var e : l)System.out.println(e);
    }
}

public class genEx2 {
    // this is an example of wildcard!
    // public static display(List<?>l){
    //     for(var e : l)System.out.println(e);
    // }
    public static void main(String[] args) {
        random obj = new random();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        obj.display(l);[[[]]]
    }   
}
