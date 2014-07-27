import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class ORGateTest {

        Wire aIn;
        Wire bIn;
        Wire out;
        ORGate gate;

    @Before
    public void setUp() throws Exception {
        out = new Wire();
        aIn = new Wire();
        bIn = new Wire();
        gate = new ORGate(aIn, bIn, out);
    }

    @Test
    public void givenTwoOffWiresShouldReturnFalse() throws Exception {

        boolean result = out.getSignal();

        assertThat(result, is(false));
    }

    @Test
    public void givenOneOffWireAndOneOnWireShouldReturnTrue() throws Exception {
        aIn.setSignal(true);
        ORGate gate = new ORGate(aIn, bIn, out);

        boolean result = out.getSignal();

        assertThat(result, is(true));
    }

    @Test
    public void givenTwoOnWIresShouldReturnTrue() throws Exception {
        aIn.setSignal(true);
        bIn.setSignal(true);
        ORGate gate = new ORGate(aIn, bIn, out);

        boolean result = out.getSignal();

        assertThat(result, is(true));
    }
}
