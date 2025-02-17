package main;

public abstract class Instrument {
    protected String manufacturer;
    protected int price;

    public Instrument(String manufacturer, int price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public abstract String getDetails();
}
