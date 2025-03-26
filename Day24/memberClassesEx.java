package Day24;

class outer{
    int val = 5;
    // Member inner class
    class inner{
        void display(){
            System.out.println("the value of val is "+val);
        }
    }
}

public class memberClassesEx {
    public static void main(String[] args) {
        outer obj = new outer();
        // to get the object of member inner class
        outer.inner inner = obj.new inner();
        inner.display();
    }
}
