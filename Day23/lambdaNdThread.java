package Day23;

public class lambdaNdThread {
    public static void main(String[] args) {
        Runnable obj = ()->{System.out.println("logic from lambda runnable interface!");};

        Thread t = new Thread(obj);
        t.start();
    }
}
