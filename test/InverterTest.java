import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class InverterTest {

    @Test
    public void shouldInvertSignal() throws Exception {
        Wire in = new Wire();
        in.setSignal(true);
        Wire out = new Wire();
        Inverter inverter = new Inverter(in, out);

        boolean result = out.getSignal();

        assertFalse(out.getSignal());
        assertThat(result, is(false));
    }

    @Test
    public void shouldInvertSignal0() throws Exception {
        Wire in = new Wire();
        in.setSignal(false);
        Wire out = new Wire();

        Inverter inverter = new Inverter(in, out);

        boolean result = out.getSignal();

        assertThat(result, is(true));

    }
}
