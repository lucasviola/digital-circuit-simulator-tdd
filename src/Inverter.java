public class Inverter {
    private Wire in;
    private Wire out;

    public Inverter(Wire in, Wire out) {
        this.out = out;
        setIn(in);
    }

    private void invert(){
        out.setSignal(!in.getSignal());
    }

    public void setIn(Wire in) {
        this.in = in;
        invert();
    }
}
