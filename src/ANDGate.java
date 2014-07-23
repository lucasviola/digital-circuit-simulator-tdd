/**
 * Created by lucas on 22/07/14.
 */
public class ANDGate {

    private Wire aIn;
    private Wire bIn;
    private Wire out;


    public ANDGate(Wire aIn, Wire bIn, Wire out) {
        this.aIn = aIn;
        this.bIn = bIn;
        this.out = out;
        process();
    }

    private void process(){
        if(aIn.getSignal() == true && bIn.getSignal() == true)
            out.setSignal(true);
    }


}
