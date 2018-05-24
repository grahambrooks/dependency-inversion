package dip;

import java.io.PrintStream;

// tag::code[]
public interface Job {
    void register(Registrar registrar);
    void run(PrintStream output);
}
// end::code[]
