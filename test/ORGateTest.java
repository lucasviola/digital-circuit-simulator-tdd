import com.sun.swing.internal.plaf.basic.resources.basic_it;
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

    @Test
    public void shouldChangeStateTwice() throws Exception {
        ORGate gate = new ORGate(aIn, bIn, out);
        boolean result = out.getSignal();
        assertThat(result, is(false));

        aIn.setSignal(true);
        gate.setaIn(aIn);
        boolean secondResult = out.getSignal();
        assertThat(secondResult, is(true));
    }

    @Test
    public void shouldChangeStateThreeTimes() throws Exception {
        ORGate gate = new ORGate(aIn, bIn, out);
        boolean result = out.getSignal();
        assertThat(result, is(false));

        bIn.setSignal(true);
        gate.setbIn(bIn);
        boolean secondResult = out.getSignal();
        assertThat(secondResult, is(true));

        aIn.setSignal(false);
        bIn.setSignal(false);
        gate.setaIn(aIn);
        gate.setbIn(bIn);
        boolean thirdResult = out.getSignal();
        assertThat(thirdResult, is(false));
    }
}
