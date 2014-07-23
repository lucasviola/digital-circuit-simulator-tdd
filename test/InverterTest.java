import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class InverterTest {

    Wire in;
    Wire out;
    Inverter inverter;

    @Before
    public void setUp() throws Exception {
        in = new Wire();
        out = new Wire();
    }

    @Test
    public void shouldInvertSignal1() throws Exception {
        in.setSignal(true);
        inverter = new Inverter(in, out);

        boolean result = out.getSignal();

        assertFalse(out.getSignal());
        assertThat(result, is(false));
    }

    @Test
    public void shouldInvertSignal0() throws Exception {
        in.setSignal(false);
        inverter = new Inverter(in, out);

        boolean result = out.getSignal();

        assertThat(result, is(true));
    }
//
//    @Test
//    public void shouldInvertSignalTwice() throws Exception {
//        in.setSignal(true);
//        inverter = new Inverter(in, out);
//        assertThat(out.getSignal(), is(false));
//
//        in.setSignal(false);
//        assertThat(out.getSignal(), is(true));
//
//    }
}
