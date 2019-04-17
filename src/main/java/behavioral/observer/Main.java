package behavioral.observer;

public class Main {

    public static void main(String[] args) {
        Recruiter recruiter =  new Recruiter();

        AndroidDeveloper androidDeveloper = new AndroidDeveloper(recruiter);
        IosDeveloper iosDeveloper = new IosDeveloper(recruiter);
        BackendDeveloper backendDeveloper = new BackendDeveloper(recruiter);


        recruiter.add(androidDeveloper);
        recruiter.add(iosDeveloper);
        recruiter.add(backendDeveloper);


        recruiter.setJobType(JobType.BACKEND);
        recruiter.sendNotifications();
    }
}
