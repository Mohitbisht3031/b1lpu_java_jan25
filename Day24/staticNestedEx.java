package Day24;

class outer{
    static class inner{
        void display(){
            System.out.println("Hi, from the static inner class!!!");
        }
    }
}

public class staticNestedEx {
    public static void main(String[] args) {
        outer.inner obj = new outer.inner();
        obj.display();
    }
}
