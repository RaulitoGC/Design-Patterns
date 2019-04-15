package structural;

public class ServiceConcrete extends Service {

    @Override
    void something(int num) {
        if (num == 1){
            System.out.println("number valid 11");
        }else{
            throw new UnsupportedOperationException("asdas");
        }
    }
}
