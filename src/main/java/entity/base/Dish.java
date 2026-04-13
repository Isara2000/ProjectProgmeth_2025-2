package entity.base;

public abstract class Dish extends Entity implements Clickable {
    private double baseReward;

    public Dish(String name, String description, double baseReward) {
        super(name, description);
        this.baseReward = baseReward;
    }

    public double getBaseReward() {
        return baseReward;
    }

    public abstract double calculateReward();
}
