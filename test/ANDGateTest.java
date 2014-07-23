import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class ANDGateTest {
    Wire aIn;
    Wire bIn;
    Wire out;
    ANDGate gate;

    @Before
    public void setUp() throws Exception {
        aIn = new Wire();
        bIn = new Wire();
        out = new Wire();
    }

    @Test
    public void givenTwoOffWiresShouldReturnOffWire() throws Exception {
        gate = new ANDGate(aIn, bIn, out);

        boolean result = out.getSignal();

        assertThat(result, is(false));
    }

    @Test
    public void givenOneOffWireAndOneOnWireShouldReturnOff() throws Exception {
        aIn.setSignal(true);
        gate = new ANDGate(aIn, bIn, out);

        boolean result = out.getSignal();

        assertThat(result, is(false));
    }

    @Test
    public void givenTwoOnWiresShouldReturnOn() throws Exception {
        aIn.setSignal(true);
        bIn.setSignal(true);
        gate = new ANDGate(aIn, bIn, out);

        boolean result = out.getSignal();

        assertThat(result, is(true));
    }
}
