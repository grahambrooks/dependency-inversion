package dip;

import java.util.HashMap;
import java.util.Map;

// tag::code[]
public class Application {
    private final Map<String, Job> hourlyJobs = new HashMap<String, Job>();
    private final Map<String, Job> dailyJobs = new HashMap<String, Job>();

    public static void main(String[] args) {
        new Application().run();
    }

    private void run() {
        final Job job = new SimpleJob();

        switch (job.getSchedule()) {
            case HOURLY:
                hourlyJobs.put(job.getName(), job);
                break;
            case DAILY:
                dailyJobs.put(job.getName(), job);
                break;
        }
    }
}
// end::code[]
