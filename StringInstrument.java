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
        System.out.println(getManufacturer() + " soittimesta viritettiin " + stringCount + " kieltä!");
    }

    @Override
    public String getDetails() {
        return "Valmistaja: " + getManufacturer() + ", Hinta: " + getPrice() + "e, Kieliä: " + stringCount;
    }
}
