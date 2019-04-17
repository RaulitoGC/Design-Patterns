package behavioral.observer;

public class AndroidDeveloper implements Observer {

    private final Recruiter subject;

    public AndroidDeveloper(Recruiter subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        if(subject.getJobTypeAvailable() ==  JobType.ANDROID){
            System.out.println(" Android developer: send CV");
        }else{
            System.out.println(" Take Holidays");
        }
    }
}
