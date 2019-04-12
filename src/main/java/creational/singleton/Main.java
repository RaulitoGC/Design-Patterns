package creational.singleton;

public class Main {
    public static void main(String[] args) {


        Logger loggerA = Logger.getInstance();
        Logger loggerB = Logger.getInstance();

        System.out.println(loggerA.hashCode());
        System.out.println(loggerB.hashCode());

        Thread t1 = new Thread(() -> {
            Logger instance1 = Logger.getInstance();
            System.out.println("Instance 1 hash:" + instance1.hashCode());
        });

        //Thread 2
        Thread t2 = new Thread(() -> {
            Logger instance2 = Logger.getInstance();
            System.out.println("Instance 2 hash:" + instance2.hashCode());
        });

        t1.start();
        t2.start();
    }
}
