public class ORGate {
    private  Wire aIn;
    private  Wire bIn;
    private  Wire out;

    public ORGate(Wire aIn, Wire bIn, Wire out) {
        this.aIn = aIn;
        this.bIn = bIn;
        this.out = out;
        changeState();
    }


    public void changeState(){
        if(aIn.getSignal() || bIn.getSignal())
            out.setSignal(true);
        else
            out.setSignal(false);
    }

    public void setaIn(Wire aIn) {
        this.aIn = aIn;
        changeState();
    }

    public void setbIn(Wire bIn) {
        this.bIn = bIn;
        changeState();
    }
}
