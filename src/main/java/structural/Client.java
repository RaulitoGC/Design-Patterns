package structural;

public class Client {

    public static void main(String[] args) {
        Service service = new ServiceConcrete();
        makeSomething(service);
    }

    private static void makeSomething(Service service) {
        try {
            service.something(2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" try one more time");
        }

    }
}
