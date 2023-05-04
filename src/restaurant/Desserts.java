package restaurant;


public enum Desserts implements Menu {
    CHEESECAKE(34.5);

    private double price;

    Desserts(double price) {
        this.price = price;
    }


    @Override
    public double getPrice() {
        return price;
    }
}
