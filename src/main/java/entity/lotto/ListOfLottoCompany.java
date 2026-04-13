package entity.lotto;

public enum ListOfLottoCompany {
    EASYCASH("01"), SUPERCASH();

    private final String companyCode;

    ListOfLottoCompany(String companyCode){
        this.companyCode = companyCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }
}
