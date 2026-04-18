package entity.lotto;

import java.util.Arrays;
import java.util.List;

public enum LottoBrands {
    EASYCASH("01"), SUPERCASH("02");

    private final String companyCode;

    LottoBrands(String companyCode){
        this.companyCode = companyCode;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public static List<LottoBrands> getAllBrands() {
        return Arrays.asList(LottoBrands.values());
    }

    public static LottoBrands fromCode(String code) {
        for (LottoBrands brand : values()) {
            if (brand.getCompanyCode().equals(code)) {
                return brand;
            }
        }
        throw new IllegalArgumentException("Unknown company code: " + code);
    }
}
