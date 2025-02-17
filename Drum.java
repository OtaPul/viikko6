package main;

public class Drum extends Instrument {
    public Drum(String manufacturer, int price) {
        super(manufacturer, price);
    }

    public void playBeat() {
        System.out.println(manufacturer + " rummut soittavat komppia!");
    }

    @Override
    public String getDetails() {
        return "Valmistaja: " + manufacturer + ", Hinta: " + price + "e (rummut)";
    }
}
