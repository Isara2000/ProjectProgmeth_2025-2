package entity.base;

public abstract class Worker extends GameObject implements Updatable, Purchasable {
    private double price;
    private double workRate; //dish washing speed rate

    public Worker(String name, String description, double price, double workRate) {
        super(name, description);
        this.price = price;
        this.workRate = workRate;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public double getWorkRate() {
        return workRate;
    }
}
