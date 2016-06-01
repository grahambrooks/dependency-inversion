package dip;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SimpleJobTest {
    // tag::code[]
    @Test
    public void registersSelfHourlyAndDailyAsSimple() {
        Registrar registrar = mock(Registrar.class);

        SimpleJob job = new SimpleJob();

        job.register(registrar);

        verify(registrar).daily("Simple", job);
        verify(registrar).hourly("Simple", job);
    }
    // end::code[]
}
