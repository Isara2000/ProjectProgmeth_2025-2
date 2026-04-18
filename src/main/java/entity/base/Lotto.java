package entity.base;

import entity.player.Player;
import logic.GameLogic;

import java.util.ArrayList;

public abstract class Lotto extends Entity implements Purchasable{
    private final double price;
    private final Category category;
    private final String id;
    private final String brandName;
    private final double reward;
    private final ArrayList<ArrayList<String>> numbers;
    private ArrayList<String> winningNumbers;

    protected Lotto(String name,
                    String description,
                    String id,
                    String brandName,
                    double price,
                    double reward,
                    ArrayList<ArrayList<String>> numbers,
                    int winningNumbersPerTicket){
        super(name, description);
        this.id = id;
        this.category = Category.LOTTO;
        this.brandName = brandName;
        this.price = Math.max(0,price);
        this.reward = Math.max(0,reward);
        this.numbers = numbers;
        setWinningNumbers(winningNumbersPerTicket);
    }

    public void cashing(Player player){
        int match = this.checkTheTicket();
        player.getWallet().add(reward*match);
    }

    public abstract int checkTheTicket();

    @Override
    public Category getCategory() {
        return category;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getId() {
        return id;
    }

    public double getReward() {
        return reward;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setWinningNumbers(int winningNumbersPerTicket) {
        this.winningNumbers = GameLogic.generateNumber(winningNumbersPerTicket);
    }

    public ArrayList<String> getWinningNumbers() {
        return winningNumbers;
    }

    public ArrayList<ArrayList<String>> getNumbers() {
        return numbers;
    }
}
