package entity.base;

import entity.player.Player;
import logic.GameLogic;

import java.util.ArrayList;

public abstract class Lotto extends Entity implements Purchasable{
    private final String companyName;
    private final double price;
    private final double reward;
    private final int numberRange;
    private final int numberPerTicket;
    private ArrayList<String> winningNumbers;
    private final int winningNumberPerTicket;
    private ArrayList<String> listOfNumber;

    protected Lotto(String id,String description, String companyName, double price, double reward, int numberRange, int numberPerTicket, int winningNumbersPerTicket){
        super(id, description);
        this.companyName = companyName;
        this.price = Math.max(0,price);
        this.reward = Math.max(0,reward);
        this.numberRange = Math.max(0,numberRange);
        this.numberPerTicket = Math.max(0,numberPerTicket);
        setWinningNumbers(winningNumbersPerTicket);
        this.winningNumberPerTicket = winningNumbersPerTicket;
        setListOfNumber(this.numberPerTicket);
    }

    public void cashing(Player player){
        int match = this.checkTheTicket();
        player.getWallet().add(reward*match);
    }

    public abstract int checkTheTicket();

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

    public int getWinningNumberPerTicket() {
        return winningNumberPerTicket;
    }

    public void setWinningNumbers(int winningNumbersPerTicket) {
        this.winningNumbers = GameLogic.generateNumber(winningNumbersPerTicket);
    }

    public ArrayList<String> getWinningNumbers() {
        return winningNumbers;
    }

    public void setListOfNumber(int length) {
        this.listOfNumber = GameLogic.generateNumber(length);
    }

    public ArrayList<String> getListOfNumber() {
        return this.listOfNumber;
    }
}
