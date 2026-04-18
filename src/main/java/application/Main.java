package application;

import entity.lotto.EasyCash;
import entity.player.Player;

public class Main {
    public static void main(String[] args){
        EasyCash temp = new EasyCash();
        Player player = new Player("john", "A guy");
        System.out.println(temp.getWinningNumbers());
        System.out.println(temp.getNumbers());
        temp.cashing(player);
        System.out.println(player.getWallet().getBalance());
    }
}
