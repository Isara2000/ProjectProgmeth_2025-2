package logic;

import entity.base.Purchasable;
import entity.lotto.LottoBrands;
import entity.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final List<LottoBrands> lottoBrands;

    public Shop(){
        lottoBrands = LottoBrands.getAllBrands();
        this.orders = new ArrayList<>();
    }

    public void addItem(Purchasable purchasable){
    }

    public boolean dropItem(){
    }

    public boolean makeOrder(Player player){
    }

    public List<LottoBrands> getLottoBrands() {
        return lottoBrands;
    }
}