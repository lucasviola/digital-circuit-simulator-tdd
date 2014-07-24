import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class ORGateTest {

    @Test
    public void givenTwoOffWiresShouldReturnFalse() throws Exception {
        Wire aIn = new Wire();
        Wire bIn = new Wire();
        Wire out = new Wire();
        ORGate gate = new ORGate(aIn, bIn, out);

        boolean result = out.getSignal();

        assertThat(result, is(false));
    }

    @Test
    public void givenOneOffWireAndOneOnWireShouldReturnTrue() throws Exception {
        Wire aIn = new Wire();
        aIn.setSignal(true);
        Wire bIn = new Wire();
        Wire out = new Wire();
        ORGate gate = new ORGate(aIn, bIn, out);

        boolean result = out.getSignal();

        assertThat(result, is(true));
    }

    @Test
    public void givenTwoOnWIresShouldReturnTrue() throws Exception {
        Wire aIn = new Wire();
        aIn.setSignal(true);
        Wire bIn = new Wire();
        bIn.setSignal(true);
        Wire out = new Wire();
        ORGate gate = new ORGate(aIn, bIn, out);

        boolean result = out.getSignal();

        assertThat(result, is(true));

    }
}
