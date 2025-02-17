package main;

public class Guitar extends StringInstrument {
    public Guitar(String manufacturer, int price) {
        super(manufacturer, price, 6);
    }

    @Override
    public String getDetails() {
        return "Valmistaja: " + manufacturer + ", Hinta: " + price + "e, Kieliä: 6 (kitara)";
    }
}
