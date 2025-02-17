package main;

public abstract class StringInstrument extends Instrument {
    private int stringCount;

    public StringInstrument(String manufacturer, int price, int stringCount) {
        super(manufacturer, price);
        this.stringCount = stringCount;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void tune() {
        System.out.println(manufacturer + " soittimesta viritettiin " + stringCount + " kieltä!");
    }
}

