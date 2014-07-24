public class ORGate {
    private  Wire aIn;
    private  Wire bIn;
    private  Wire out;

    public ORGate(Wire aIn, Wire bIn, Wire out) {
        this.aIn = aIn;
        this.bIn = bIn;
        this.out = out;
        process();
    }


    public void process(){
        if(aIn.getSignal() || bIn.getSignal())
            out.setSignal(true);
    }
}
