public class ANDGate {

    private Wire aIn;
    private Wire bIn;
    private Wire out;


    public ANDGate(Wire aIn, Wire bIn, Wire out) {
        this.out = out;
        this.aIn = aIn;
        this.bIn = bIn;
        changeState();
    }

    private void changeState(){
        if(aIn.getSignal() && bIn.getSignal())
            out.setSignal(true);
    }

    public void setaIn(Wire aIn) {
        this.aIn = aIn;
        if(aIn.getSignal() && bIn.getSignal())
            out.setSignal(true);
        else
            out.setSignal(false);
    }

    public void setbIn(Wire bIn) {
        this.bIn = bIn;
        if(aIn.getSignal() && bIn.getSignal())
            out.setSignal(true);
        else
            out.setSignal(false);
    }
}
