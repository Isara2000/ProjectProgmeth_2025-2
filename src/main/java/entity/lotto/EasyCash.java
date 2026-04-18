package entity.lotto;

import entity.base.Lotto;
import logic.GameLogic;

import java.util.ArrayList;

public class EasyCash extends Lotto {
    public EasyCash(){
        super("EasyCashLotto",
                "this is first lotto that player can purchase",
                GameLogic.createLottoId("EasyCash"),
                "EasyCash",
                100,
                200,
                GameLogic.groupNumber(GameLogic.generateNumber(30), 6, 5, "00"),
                6);
    }

    @Override
    public int checkTheTicket() {
        int match = 0;
        for(ArrayList<String> row: this.getNumbers()){
            for(String number: row){
                if(this.getWinningNumbers().contains(number)){
                    match++;
                }
            }
        }
        return match;
    }
}
