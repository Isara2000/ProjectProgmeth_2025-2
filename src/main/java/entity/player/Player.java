package entity.player;

import entity.base.Entity;

public class Player extends Entity{
    private String name;
    private final Wallet wallet;
    private final Inventory inventory;

    public Player(String name, String description) {
        super(name, description);
        this.wallet = new Wallet();
        this.inventory = new Inventory();
    }

    public Wallet getWallet() {
        return this.wallet;
    }
    public Inventory getInventory() { return this.inventory; }
}
