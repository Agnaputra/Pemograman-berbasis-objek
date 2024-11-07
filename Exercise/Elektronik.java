package Exercise;

public class Elektronik {
    protected int voltase;

    public Elektronik() {
        this.voltase = 220;  // Default voltase
    }

    public int getVoltase() {
        return voltase;
    }
}

class TelevisiJadul extends Elektronik {
    private String modeInput;

    public TelevisiJadul() {
        super();
        this.modeInput = "DVI";
    }

    public String getModeInput() {
        return modeInput;
    }
}

class TelevisiModern extends Elektronik {
    private String modeInput;

    public TelevisiModern() {
        super();
        this.modeInput = "HDMI";
    }

    public String getModeInput() {
        return modeInput;
    }
}

