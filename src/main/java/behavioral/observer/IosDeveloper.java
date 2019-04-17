package behavioral.observer;

public class IosDeveloper implements Observer {

    private final Recruiter subject;

    public IosDeveloper(Recruiter subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        if(subject.getJobTypeAvailable() ==  JobType.IOS){
            System.out.println(" iOS developer: send CV");
        }else{
            System.out.println(" Take Holidays");
        }

    }
}
