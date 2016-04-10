package dip;

public class Application {
    public static void main(String[] args) {
        new Application().run();
    }

    private void run() {
        final Job job = new SimpleJob();

        System.out.println("Starting job");
        job.run(System.out);
        System.out.println("Job done");
    }
}
