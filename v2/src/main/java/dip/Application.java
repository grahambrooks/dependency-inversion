package dip;

import java.util.HashMap;
import java.util.Map;

// tag::code[]
public class Application implements Registrar {
    private final Map<String, Job> hourlyJobs = new HashMap<String, Job>();
    private final Map<String, Job> dailyJobs = new HashMap<String, Job>();

    public static void main(String[] args) {
        new Application().run();
    }

    private void run() {
        final Job job = new SimpleJob();
        job.register(this);
    }

    public void daily(String name, Job job) {
        dailyJobs.put(name, job);
    }

    public void hourly(String name, Job job) {
        hourlyJobs.put(name, job);
    }
}
// end::code[]
