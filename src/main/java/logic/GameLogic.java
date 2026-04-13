package logic;

import entity.lotto.ListOfLottoCompany;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GameLogic {
    public static ArrayList<String> generateNumber(int length){
        ArrayList<String> resultNumber = new ArrayList<>();
        int count = 0;
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        while(count < length) {
            int n = rnd.nextInt(1, 100);
            String padded = String.format("%02d", n);
            if ((!resultNumber.contains(padded))) {
                resultNumber.add(padded);
                count++;
            }
        }
        return resultNumber;
    }
    public static String createLottoId(String companyName){
        int length = 10;
        String companyCode = ListOfLottoCompany.valueOf(companyName).getCompanyCode();
        StringBuilder sb = new StringBuilder(length);
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        for (int i = 0; i < length; i++) {
            sb.append(rnd.nextInt(0, 10));
        }
        return companyCode + sb.toString();
    }
}
