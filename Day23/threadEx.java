package Day23;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("executing the logic thread needs to execute!");
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("inside the logic of runnable interface!");
    }
}

public class threadEx {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        System.out.println("just before starting the thread");
        t.start();

        MyRunnable task = new MyRunnable();
        Thread t2 = new Thread(task);
        t2.start();

        // System.out.println("after starting the thread");
    }
}
