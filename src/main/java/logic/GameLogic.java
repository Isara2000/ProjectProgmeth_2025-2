package logic;

import java.util.ArrayList;

public class GameLogic {
    public static ArrayList<Integer> generateNumber(int range){
        ArrayList<Integer> resultNumber = new ArrayList<>();
        for(int i = 0; i < range; i++) {
            int randomNumber = (int) (Math.random() * 100);
            if ((!resultNumber.contains(randomNumber) && randomNumber != 0)) {
                resultNumber.add(randomNumber);
            }
        }
        return resultNumber;
    }
}
