package restaurant;

public enum Drink implements Menu {
    COLA(5.6),
    APPLE_JUICE(4.5),
    ORANGE_JUICE(3.2);

    private double price;

    Drink(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
