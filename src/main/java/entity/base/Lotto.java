package entity.base;

import entity.player.Player;
import logic.GameLogic;

import java.util.ArrayList;

public abstract class Lotto extends Entity {
    private String companyName;
    private double price;
    private double reward;
    private int numberRange;
    private int numberPerTicket;
    private ArrayList<Integer> winningNumbers;

    protected Lotto(String id,String description, String companyName, double price, double reward, int numberRange, int numberPerTicket, int winningNumbersPerTicket){
        super(id, description);
        setPrice(price);
        setReward(reward);
        setCompanyName(companyName);
        setNumberRange(numberRange);
        setNumberPerTicket(numberPerTicket);
        setWinningNumbers(winningNumbersPerTicket);
    }

    public void cashing(Player player, int match){
        player.getWallet().add(reward*match);
    }

    public abstract void checkTheTicket();

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPrice(double price) {
        this.price = Math.max(0,price);
    }

    public void setReward(double reward) {
        this.reward = Math.max(0,reward);
    }

    public void setNumberRange(int numberRange) {
        this.numberRange = Math.max(0,numberRange);
    }

    public void setNumberPerTicket(int numberPerTicket) {
        this.numberPerTicket = Math.max(0,numberPerTicket);
    }

    public double getPrice() {
        return price;
    }

    public double getReward() {
        return reward;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getNumberRange() {
        return numberRange;
    }

    public int getNumberPerTicket() {
        return numberPerTicket;
    }

    public void setWinningNumbers(int winningNumbersPerTicket) {
        this.winningNumbers = GameLogic.generateNumber(winningNumbersPerTicket);
    }

    public ArrayList<Integer> getWinningNumbers() {
        return winningNumbers;
    }
}
