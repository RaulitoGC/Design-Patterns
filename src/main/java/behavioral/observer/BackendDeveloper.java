package behavioral.observer;

public class BackendDeveloper implements Observer{
    private final Recruiter subject;

    public BackendDeveloper(Recruiter subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        if(subject.getJobTypeAvailable() ==  JobType.BACKEND){
            System.out.println(" Backend Developer : send CV");
        }else{
            System.out.println(" Take Holidays");
        }
    }
}
