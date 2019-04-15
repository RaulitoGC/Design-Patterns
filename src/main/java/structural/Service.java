package structural;

public abstract class Service {


    void something(int num) throws NumberFormatException {
        if (num == 1) {
            System.out.println(" valid num");
        } else {
            throw new NumberFormatException("Number invalid");
        }
    }
}
