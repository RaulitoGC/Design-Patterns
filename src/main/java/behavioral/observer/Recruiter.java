package behavioral.observer;

import java.util.List;

public class Recruiter extends Observable {

    private JobType jobTypeAvailable;

    public void setJobType(JobType jobTypeAvailable) {
        this.jobTypeAvailable = jobTypeAvailable;
    }

    public JobType getJobTypeAvailable() {
        return jobTypeAvailable;
    }
}
