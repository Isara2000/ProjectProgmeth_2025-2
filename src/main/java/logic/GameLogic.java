package logic;

import entity.lotto.LottoBrands;

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
    public static ArrayList<ArrayList<String>> groupNumber(ArrayList<String> initialNumbers, int row, int column){
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for(int i = 0; i < row; i++){
            ArrayList<String> temporaryColumn = new ArrayList<>();
            for(int j = 0; j < column; j++){
                int index = i*column+j;
                if(index < initialNumbers.size()){
                    temporaryColumn.add(initialNumbers.get(index));
                }else{
                    temporaryColumn.add("0");
                }
            }
            result.add(temporaryColumn);
        }
        return result;
    }
    public static ArrayList<ArrayList<String>> groupNumber(ArrayList<String> initialNumbers, int row, int column, String exceedNumber){
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for(int i = 0; i < row; i++){
            ArrayList<String> temporaryColumn = new ArrayList<>();
            for(int j = 0; j < column; j++){
                int index = i*column+j;
                if(index < initialNumbers.size()){
                    temporaryColumn.add(initialNumbers.get(index));
                }else{
                    temporaryColumn.add(exceedNumber);
                }
            }
            result.add(temporaryColumn);
        }
        return result;
    }
    public static String createLottoId(String companyName){
        int length = 10;
        String companyCode = LottoBrands.valueOf(companyName.toUpperCase()).getCompanyCode();
        StringBuilder sb = new StringBuilder(length);
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        for (int i = 0; i < length; i++) {
            sb.append(rnd.nextInt(0, 10));
        }
        return companyCode + sb.toString();
    }
}
