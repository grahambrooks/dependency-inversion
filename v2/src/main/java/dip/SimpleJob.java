package dip;

import java.io.PrintStream;

// tag::code[]
public class SimpleJob implements Job {
    public void register(Registrar registrar) {
        registrar.daily("Simple", this);
        registrar.hourly("Simple", this);
    }

    public void run(PrintStream output) {
        output.println("Daily activity");
    }
}
// end::code[]
