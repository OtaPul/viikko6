package main;

public class Violin extends StringInstrument {
    public Violin(String manufacturer, int price) {
        super(manufacturer, price, 4);
    }

    @Override
    public String getDetails() {
        return "Valmistaja: " + manufacturer + ", Hinta: " + price + "e, Kieliä: 4 (viulu)";
    }
}
