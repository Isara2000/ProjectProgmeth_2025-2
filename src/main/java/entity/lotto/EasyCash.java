package entity.lotto;

import entity.base.Lotto;
import logic.GameLogic;

public class EasyCash extends Lotto {
    public EasyCash(){
        super(GameLogic.createLottoId("EasyCash"),
                "This is first lotto that player can purchase",
                "EasyCash",
                10, 10, 100, 30, 6);
    }

    @Override
    public int checkTheTicket() {
        int match = 0;
        for(String number : this.getListOfNumber()){
            if(this.getWinningNumbers().contains(number)){
                match++;
            }
        }
        return match;
    }
}
