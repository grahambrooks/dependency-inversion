package dip;

import java.io.PrintStream;

public class SimpleJob implements Job{

    public void run(PrintStream output) {
        output.println("This is the job");
    }
}
