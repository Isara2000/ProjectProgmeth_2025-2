package entity.player;

import entity.base.Entity;

public class Player extends Entity{
    private String name;
    private final Wallet wallet;

    protected Player(String name, String description) {
        super(name, description);
        this.wallet = new Wallet();
    }

    public Wallet getWallet() {
        return wallet;
    }
}
