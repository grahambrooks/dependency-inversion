package dip;

import java.io.PrintStream;

// tag::code[]
public interface Job {
    String getName();
    Schedule getSchedule();
    void run(PrintStream output);
}
// end::code[]

