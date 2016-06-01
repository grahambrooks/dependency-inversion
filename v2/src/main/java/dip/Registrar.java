package dip;

// tag::code[]
public interface Registrar {
    void daily(String name, Job job);

    void hourly(String name, Job job);
}
// end::code[]
