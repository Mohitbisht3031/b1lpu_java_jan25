package Day24;

class outer{
    int val = 5;
    void usingInner(){
        class LocalInnerClass{
            void display(){
                System.out.println("the value of vla is "+val);
            }
        }
        LocalInnerClass obj = new LocalInnerClass();
        obj.display();
    }
}

public class localClassEx {
    public static void main(String[] args) {
        outer obj = new outer();
        obj.usingInner();
    }
}
