package dip;

import java.io.PrintStream;

// tag::code[]
public class SimpleJob implements Job {

    public String getName() {
        return "Simple";
    }

    public Schedule getSchedule() {
        return Schedule.DAILY;
    }

    public void run(PrintStream output) {
        output.println("Daily activity");
    }
}
// end::code[]
