import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Inverter {
    private Wire in;
    private Wire out;

    public Inverter(Wire in, Wire out) {
        this.in = in;
        this.out = out;
        invert();
    }

    private void invert(){
        out.setSignal(!in.getSignal());
    }



}
