import javax.swing.event.ChangeListener;

/**
 * Created by lucas on 22/07/14.
 */
public class Wire {
    private boolean signal = false;

    public void setSignal(boolean signal) {

        this.signal = signal;
    }

    public boolean getSignal() {
        return this.signal;
    }

}
